# Uma colinha para me ajudar no primeiro projeto do Bootcamp AWS
### Para criar vários usuarios de uma vez escreva o comando abaixo várias vezes, uma para cada usuario em um arquivo .sh

```bash 
useradd nome_de_usuario -c "Nome para exibir" -s /bin/ -m -p $(openssl passwd -crypt senhaCriada)
```  
caso tenha duvidas sobre cada parametro, use o --help

```bash 
passwd nome_de_usuario -e 
```   
o parametro -e é usado para definir uma data de expiração, mas caso nada seja colocado, ele será expirado no momento que o usuario 
digitar a senha pela primeira vez forçando-o a criar uma nova senha  
```bash 
usermod -G adm,sudo nome_de_usuario
```  
para adicionar o usuario a um ou mais grupos, esse comando também irá tirar o usuario dos grupos em que ele não está
  

o usermod pode ser usado para várias coisas, alterar senha, permitir o uso do shell caso tenha sido esquecido.
o parametro -G maiusculo indica que o usuario vai ser colocado em vários grupos

```bash 
cat /etc/group
```  

o comando acima é usado para verificar em quais grupos os usuarios estão inseridos

```bash
 groupadd NOMEDOGRUPO
 ```  

o legal desse grupo é que a alteração nas permissões será aplicada em todos os usuarios do grupo

```bash
 chown novousuario:novogrupo /diretorio_ou_pasta/ 
 ```  
chown é a abreviação de change owner, para que o dono do diretorio que tem determinadas permissões seja alterado
## Para alterar permissões de Leitura, Gravação e Execução use a tabela abaixo  
|Permissão |Valor|
|-|-|
 | Leitura(r)  | 4 |
 | Gravação(w) | 2 |
 | Execução(x) | 1 |
 | Nenhuma | 0 |
  
use o comando abaixo para fazer uma alteração de permissões
o usuario atual tem as três permissões (soma 7)
os usuarios do grupo tem apenas as permissões de leitura e execução(soma 5)
os demais usuarios não tem permissão nenhuma(0)
```bash
chmod 750 /diretorio_ou_arquivo/ 
```
