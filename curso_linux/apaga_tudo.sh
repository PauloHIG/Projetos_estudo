#!/bin/bash

sudo rm /home/publico -rf
sudo rm /home/adm -rf
sudo rm /home/ven -rf
sudo rm /home/sec -rf
#usando a lista para iterar por vários usuarios, posso criar um arquivo de configuração fácil de manipular no futuro, garantindo economia de tempo e de linhas de código
usuarios=("carlos" "maria" "joao" "debora" "sebastiana" "roberto" "josefina" "amanda" "rogerio")
for usuario in "${usuarios[@]}";do
	sudo userdel -r "$usuario"
done

grupos=("GRP_ADM" "GRP_VEN" "GRP_SEC")
for grupo in "${grupos[@]}";do
	sudo groupdel "$grupo"
done
