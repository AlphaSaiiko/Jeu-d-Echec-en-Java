# docker-sae2.03
https://github.com/AlphaSaiiko/docker-sae2.03/  

Lancez une console  
Vérifiez si docker est installé :  

<code>docker --version</code>  

Cloner le référentiel :  

<code>git clone git@github.com:AlphaSaiiko/docker-sae203.git</code>

Aller au référentiel :
<code>cd docker-sae203</code>

Il est important à noter que pour faire marcher le jeu sur votre machine , il faut changer l'ip dans le controleur ( mettre celle de votre machine obtenu grace à ipconfig (sur windows)).

Il faut créer l'image grace au dockerfile fourni , la lancer , puis apres cela le joueur 1 et 2 peuvent executer le controleur . 

Pour tester , au niveau de l'arborescence , se mettre à : docker-sae2023

copiez collez ça :

javac ./src/*.java && cd .. && docker build -t onlinechess -f docker-sae2.03/Dockerfile.dockerfile docker-sae2.03 && cd docker-sae2.03 && docker run --name onlinechess -d -p 6666:6666 onlinechess 

Pour juste refaire un serveur avec la meme image :
docker stop onlinechess && docker start onlinechess

Pour supprimez une image :
docker stop onlinechess && docker rm onlinechess
