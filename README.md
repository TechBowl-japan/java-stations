# Java Railway 入門編 テンプレートリポジトリ

このリポジトリは [TechTrain](https://techtrain.dev) が提供する実践問題集 **Java Railway 入門編**に取り組むためのテンプレートリポジトリです。

TechTrainで案内される内容に従い、このリポジトリを使って問題に取り組んでください。


## 1. 開発環境を構築しよう

このリポジトリを使って問題に取り組むために事前に以下のインストールを完了してください

- Git
- Visual Studio Code

### Windowsの場合

[Windowsにおける環境構築手順](./docs/README-windows.md)を参照してください

### macOSの場合

[macOSにおける環境構築手順](./docs/README-macos.md)を参照してください

## 2. Java Railwayのテンプレートを用意しよう

1. GitHubにログインします。アカウントをお持ちでない場合は新たに作成してください。
2. このリポジトリをフォークします。リポジトリの右上にある「Fork」ボタンをクリックしてください。
3. フォークが完了すると、あなたのGitHubアカウントにこのリポジトリのコピーが作成されます。
4. あなたのGitHubアカウントに作成されたリポジトリをローカルにクローンします。
5. ターミナルを開き、以下のコマンドを実行してください。`{username}` はあなたのGitHubのユーザ名に置き換えてください。
  ```bash
  git clone https://github.com/{username}/java-stations.git
  ```
6. クローンが完了すると、`java-stations` というディレクトリが作成されます。このディレクトリがこのリポジトリのローカルリポジトリです。
7. `java-stations` ディレクトリに移動し、Visual Studio Code で開いてください。
  ```bash
  cd java-stations
  code .
  ```
8. Visual Studio Code が起動し、`java-stations` ディレクトリが開かれます。

## 3. TechTrain Railway の VSCode Extension をインストールしよう

1. Visual Studio Code を開いてください
2. 左側のアクティビティバーから「Extensions」をクリックしてください
3. 検索バーに `TechTrain Railway` と入力してください
4. TechTrain Railway の拡張機能が表示されるので、インストールボタンをクリックしてください
5. インストールが完了すると、左側のアクティビティバーに TechTrain Railway のアイコンが表示されます
6. TechTrain Railway のアイコンをクリックすると、ログインが要求されますので、TechTrainにご登録のIDとパスワードでログインします。
7. ログインに成功すると、該当するRailwayの内容が表示されます。以上で、TechTrain Railway のVSCode Extension のインストールが完了です。

## 4. Extension Pack for Java をインストールしよう

Extension Pack for Java は、Java開発に必要な拡張機能をまとめて提供する拡張機能パックです。Java開発に必要な拡張機能がまとめてインストールされるため、Java開発環境のセットアップが簡単に行えます。

1. Visual Studio Code を開いてください
2. 左側のアクティビティバーから「Extensions」をクリックしてください（日本語プラグインを入れている場合は「拡張機能」をクリック）
3. 検索バーに `Extension Pack for Java` と入力してください
4. Extension Pack for Java の拡張機能が表示されるので、インストールボタンをクリックしてください

## 確認テストへの取り組み方

必ず上記の環境構築にて、Java Railwayに取り組むための環境を整えてください。

Visual Studio Codeを使用してコードを編集し、「TechTrain Railway」という拡張機能から「できた!」と書かれた青いボタンをクリックすると判定が始まります。合格と判定されると、TechTrainの合否結果に反映されます。また、TechTrain Railwayに表示される問題文が次のステップへ進みます。

もし、合格判定にかかわらず詳細にテストを実施したい場合は、下記コマンドのStation番号(Station1の場合、`S1`)を変更し、ターミナルから実行することもできます（TechTrainの合否結果には反映されません）

```bash
mvn test -Dtest=S1
```