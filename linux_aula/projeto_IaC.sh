#!/bin/bash
echo "Criando vários usuarios"
sudo useradd -p $(openssl passwd -1 tempo) -m -s /bin/bash temporario

echo "Colocando expiração para que ele crie uma nova senha"
sudo passwd temporario -e

