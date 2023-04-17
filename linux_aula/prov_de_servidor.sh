#! /bin/bash
sudo apt -upgrade -y
apt install unzip
apt install apache2

wget https://github.com/denilsonbonatti/linux-site-dio/archive/refs/heads/main.zip -P /tmp/

unzip /tmp/main.zip -d /var/www/html
mv /var/www/html/linux-site-dio-main/* /var/www/html

