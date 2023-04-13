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

echo "Alterando dono e grupo dos diretórios criados"
sudo chown root:GRP_ADM /home/adm
sudo chown root:GRP_VEN /home/ven
sudo chown root:GRP_SEC /home/sec

echo "Alterando permissões para os diretorios"
sudo chmod 777 /home/publico
sudo chmod 770 /home/adm
sudo chmod 770 /home/ven
sudo chmod 770 /home/sec

echo "Criando vários usuarios"
usuarios=("carlos" "maria" "joao" "debora" "sebastiana" "roberto" "josefina" "amanda" "rogerio")
for usuario in "${usuarios[@]}";do
	sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash "$usuario"
done

echo "Colocando expiração para que ele crie uma nova senha"
for usuario in "${usuarios[@]}";do
	sudo passwd "$usuario" -e
done

echo "Colocado cada usuario em seu respectivo grupo"
sudo usermod -G GRP_ADM carlos
sudo usermod -G GRP_ADM maria
sudo usermod -G GRP_ADM joao

sudo usermod -G GRP_VEN debora
sudo usermod -G GRP_VEN sebastiana
sudo usermod -G GRP_VEN roberto

sudo usermod -G GRP_SEC josefina
sudo usermod -G GRP_SEC amanda
sudo usermod -G GRP_SEC rogerio
