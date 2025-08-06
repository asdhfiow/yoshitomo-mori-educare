## ⚙ コンパイル方法
1. **`src` ディレクトリへ移動**
    ```bash
    cd src
    ```
2. **コンパイル（Gson の jar を指定）**
    - macOS / Linux の場合：
      ```bash
      javac -cp ../lib/gson-2.10.1.jar:. Main4.java Employee.java
      ```
    - Windows の場合：
      ```bash
      javac -cp ../lib/gson-2.10.1.jar;. Main4.java Employee.java
      ```

## ▶ 実行方法
- macOS / Linux の場合：
  ```bash
  java -cp ../lib/gson-2.10.1.jar:. Main4
