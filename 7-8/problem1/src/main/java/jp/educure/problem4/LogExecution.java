package jp.educure.problem4;

import java.lang.annotation.*;

@Target(ElementType.METHOD)       // メソッドに付与する
@Retention(RetentionPolicy.RUNTIME) // 実行時に反映される
public @interface LogExecution {
}
