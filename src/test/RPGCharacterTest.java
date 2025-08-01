package test;

import main.RPGCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RPGCharacterTest {

    RPGCharacter character = new RPGCharacter();
    
    @Test
    void testInitialStatus() {
        // ここに初期状態のテストを書く
        assertEquals(1, character.getLevel(), "初期レベルは1であるべき");
        assertEquals(100, character.getHP(), "初期HPは100であるべき");
        assertEquals(50, character.getMP(), "初期MPは50であるべき");
    }

    @Test
    void testNormalLevelUp() {
        // ここに通常のレベルアップテストを書く
        assertEquals(2, character.getLevel(), "レベルは1上がって2になるべき");
        assertEquals(110, character.getHP(), "HPは10増加して110になるべき");
        assertEquals(55, character.getMP(), "MPは5増加して55になるべき");
    }

    @Test
    void testMaxLevel() {
        // ここに境界値のテストを書く
        //レベルを98まで上げる
        for (int i = 1; i < 98; i++){
            character.levelUp();
        }

        // レベル98→99への正常なレベルアップ
        character.levelUp();
        assertEquals(99, character.getLevel(), "レベルは99になるべき");
        assertEquals(100 + 10 * (99 - 1), character.getHP(), "HPはレベルアップ分増加するべき");
        assertEquals(50 + 5 * (99 - 1), character.getMP(), "MPはレベルアップ分増加するべき");

        //99からのレベルアップは例外発生を確認
        try {
            character.levelUp();
            fail("最大レベルでレベルアップした場合は例外を投げるべきです");
        }catch (IllegalStateException e) {
            assertEquals("最大レベルに達しています", e.getMessage(), "例外メッセージが正しいことを確認");
        }
    }
}
    
    
