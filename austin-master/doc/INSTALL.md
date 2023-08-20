## Installing MYSQL

**1**. Download and install MySQL:

```
wget -i -c http://dev.mysql.com/get/mysql57-community-release-el7-10.noarch.rpm
yum -y install mysql57-community-release-el7-10.noarch.rpm
yum -y install mysql-community-server --nogpgcheck
```

**2**. Start and check the status of MySQL:

```
systemctl start  mysqld.service
systemctl status mysqld.service
```

**3**. Retrieve the default password for MySQL:

```
grep "password" /var/log/mysqld.log
```



**4**. Log in to MySQL:

```
mysql -uroot -p
```

**5**. Change the default password (make sure your password has a combination of uppercase, lowercase, and symbols for security). Replace 'my password' with your own password:

```
ALTER USER 'root'@'localhost' IDENTIFIED BY 'my password';
```

**6**. Enable remote access (replace 'my password' with your own password):

```
grant all privileges on *.* to 'root'@'%' identified by 'my password' with grant option;

flush privileges;

exit
```

**7**. Add MySQL port on cloud service.

##  Installing DOCKER and DOCKER-COMPOSE

Firstly, you'll need to install the GCC environment:

```
yum -y install gcc

yum -y install gcc-c++
```

Install the required packages for Docker:

```
yum install -y yum-utils device-mapper-persistent-data lvm2
```


Update the yum package index:
```
yum makecache fast
```

Install DOCKER CE

```
yum -y install docker-ce
```

Start Docker:

```
systemctl start docker
```

Check the Docker version:

```
docker version
```

Run the following command to download the current stable version of Docker Compose:
```
sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

# If the above is slow, you can use this:
sudo curl -L https://get.daocloud.io/docker/compose/releases/download/1.25.1/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose

```

Apply executable permissions to the binary:

```
sudo chmod +x /usr/local/bin/docker-compose
```

Create a symbolic link:

```
sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
```

Test if the installation was successful:

```
docker-compose --version
```


(Note: Middleware of this project(apollo, flink, graylog, hive, kafka, mysql, nacos, prometheus, rabbitmq, redis, rocketmq, xxljob) is deployed using docker; refer to the docker folder in the project for the file content.)