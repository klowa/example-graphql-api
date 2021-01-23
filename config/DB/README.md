# command
```
$ docker exec -it mysql-container sh
$ mysql -u user001 -p

# データベース一覧を表示
mysql> show databases;
# 使用するデータベースを変更
mysql> use graphql-database
# テーブル一覧を表示
mysql> show tables;
# テーブル詳細表示
mysql> desc author;
# データ表示
mysql> select * from author;
# ログアウト
mysql > exit
```