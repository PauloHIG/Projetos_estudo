#!/bin/bash
echo "Criando diretorios"
sudo mkdir /home/publico
sudo mkdir /home/adm
sudo mkdir /home/ven
sudo mkdir /home/sec

echo "Criando Grupos"
sudo groupadd GRP_ADM
sudo groupadd GRP_VEN
sudo groupadd GRP_SEC

echo "Alterando grupos dos diretorios"
sudo chgrp GRP_ADM /home/adm
sudo chgrp GRP_VEN /home/ven
sudo chgrp GRP_SEC /home/sec

echo "Alterando permissões para os diretorios"
sudo chmod 777 /home/publico
sudo chmod 770 /home/adm
sudo chmod 770 /home/ven
sudo chmod 770 /home/se

echo "Criando vários usuarios"
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash carlos
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash maria
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash joao

sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash debora
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash sebastiana
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash roberto

sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash josefina
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash amanda
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash rogerio

echo "Colocado cada usuario em seu respectivo grupo"
sudo usermod -G GRP_ADM carlos maria joao
sudo usermod -G GRP_VEN debora sebastiana roberto
sudo usermod -G GRP_SEC josefina amanda rogerio

echo "Colocando expiração para que ele crie uma nova senha"
#nota, não implementado para que eu pudesse fazer os testes mais rápido
#passwd temporario -e
