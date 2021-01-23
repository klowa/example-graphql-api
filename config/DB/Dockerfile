FROM mysql:5.7

# 1 パッケージアップデートとwgetインストール 
RUN apt-get update
RUN apt-get install -y wget

# 2 entrykitのインストール
RUN wget https://github.com/progrium/entrykit/releases/download/v0.4.0/entrykit_0.4.0_linux_x86_64.tgz
RUN tar -xvzf entrykit_0.4.0_linux_x86_64.tgz
RUN rm entrykit_0.4.0_linux_x86_64.tgz
RUN mv entrykit /usr/local/bin/
RUN entrykit --symlink

# 3 スクリプトと各種設定ファイルのコピー
COPY etc/custom.cnf /etc/mysql/conf.d/mysql.cnf
COPY sql /docker-entrypoint-initdb.d

# 4 スクリプトとmysqldの実行 
ENTRYPOINT ["docker-entrypoint.sh"]

CMD ["mysqld"]
