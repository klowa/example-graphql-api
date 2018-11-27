#!/bin/sh

# 既に起動していたら停止
/usr/local/bin/docker container stop mysqld-graphql > /dev/null 2>&1

# 起動していたプロセスの削除
/usr/local/bin/docker container rm mysqld-graphql > /dev/null 2>&1

# 起動
/usr/local/bin/docker run --name mysqld-graphql \
    -v $(pwd)/config/DB/etc:/etc/mysql/conf.d \
    -v $(pwd)/config/DB:/docker-entrypoint-initdb.d \
    -e MYSQL_DATABASE=sample \
    -e MYSQL_ALLOW_EMPTY_PASSWORD=yes \
    -e TZ=Asia/Tokyo \
    -d \
    -p 43307:3306 \
    mysql:5.7

# 立ち上がるまで少し待つ
sleep 5
