package test;

import main.RPGCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RPGCharacterTest {

    @Test
    void testInitialStatus() {
        RPGCharacter character = new RPGCharacter();
        assertEquals(1, character.getLevel(), "初期レベルは1であるべきです");
        assertEquals(100, character.getHP(), "初期HPは100であるべきです");
        assertEquals(50, character.getMP(), "初期MPは50であるべきです");
    }

    @Test
    void testNormalLevelUp() {
        RPGCharacter character = new RPGCharacter();
        character.levelUp();
        assertEquals(2, character.getLevel(), "レベルは1上がって2になるべきです");
        assertEquals(110, character.getHP(), "HPは10増加して110になるべきです");
        assertEquals(55, character.getMP(), "MPは5増加して55になるべきです");
    }

    @Test
    void testMaxLevel() throws Exception {
        RPGCharacter character = new RPGCharacter();

        // private変数levelにリフレクションで直接セット
        java.lang.reflect.Field levelField = RPGCharacter.class.getDeclaredField("level");
        levelField.setAccessible(true);
        levelField.setInt(character, 98);

        // 98→99正常にレベルアップ
        character.levelUp();
        assertEquals(99, character.getLevel(), "レベルは99に上がるべきです");
        assertEquals(100 + 10 * (99 - 1), character.getHP(), "HPはレベルアップ分増加しているべきです");
        assertEquals(50 + 5 * (99 - 1), character.getMP(), "MPはレベルアップ分増加しているべきです");

        // 99からのレベルアップは例外発生を確認
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> {
            character.levelUp();
        }, "最大レベル99でのレベルアップは例外を投げるべきです");
        assertEquals("最大レベルに達しています", e.getMessage(), "例外メッセージを検証");
    }
}
