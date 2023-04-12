# Uma colinha para me ajudar no primeiro projeto do Bootcamp AWS

```bash useradd nome_de_usuario -c "Nome para exibir" -s /bin/bash -m -p $(openssl passwd -crypt senhaCriada)```  
caso tenha duvidas sobre cada parametro, use o --help

```bash passwd nome_de_usuario -e ```   
o parametro -e é usado para definir uma data de expiração, mas caso nada seja colocado, ele será expirado no momento que o usuario 
digitar a senha pela primeira vez forçando-o a criar uma nova senha  
```bash usermod -G adm,sudo nome_de_usuario```  
para adicionar o usuario a um ou mais grupos, esse comando também irá tirar o usuario dos grupos em que ele não está
  

o usermod pode ser usado para várias coisas, alterar senha, permitir o uso do shell caso tenha sido esquecido.
o parametro -G maiusculo indica que o usuario vai ser colocado em vários grupos

```bash cat /etc/group```  
o comando acima é usado para verificar em quais grupos o usuario está inserido

```bash groupadd NOMEDOGRUPO```  

o legal desse grupo é que a alteração nas permissões será aplicada em todos os usuarios do grupo