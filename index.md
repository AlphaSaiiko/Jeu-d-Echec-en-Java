# SAE 2.03 GROUPE 03

## Table des matières
- [Introduction](#introduction)
- [Idée de projet](#idée-de-projet)
- [Organisation et conception](#organisation-et-conception)
- [Problèmes rencontrés](#problèmes-rencontrés)
- [Améliorations possibles](#améliorations-possibles)
- [Conclusion](#conclusion)

## Introduction {#introduction}
Bienvenue sur notre site de présentation de notre projet pour cette SAE !  

Ce projet a été conçu par le groupe 3 composé de : Alexandre PRADIGNAC , Antoine LECHASLES , Aubin MONTAGNE et Fanch EVEN  


## Idée de projet {#idée-de-projet}
Notre groupe avons décidé de nous orienter sur un jeu d'échec , 2 personnes sont habitués à y jouer ce qui allait rendre le back-end plus simple pour eux par rapport à la logique des déplacements des pièces , de plus , à travers le jeu d'échec nous pouvons balayer beaucoup de notions d'abord vus en développement , et également réutilisé ce que nous avons fait lors des cours de réseaux ( Client / Serveur ) .  

![image](https://github.com/AlphaSaiiko/docker-sae2.03/assets/150456122/78642b57-b165-447a-84e9-95bd3247291e)



## Organisation et conception {#organisation-et-conception}
Le 15/04/2024 : Matin .  

Plusieurs idées ont émané avant d'avoir cette idée finale de jeu d'échec , de base nous voulions faire un jeu un peu plus "costaud" mais par peur de temps nous avons préféré être prudent .  

Pour être le plus efficace possible , nous nous sommes séparés le travail comme ceci pour cette première matinée :  


Aubin     : Partie Réseau , s'occupe de l'implémentation du multijoueur ( Client / Serveur ) .  

Alexandre : Partie front-end , travaille avec Antoine sur l'IHM .  

Antoine   : Partie front-end , travaille avec Alexandre sur l'IHM .  

Fanch     : Partie back-end  , travaille sur la partie Métier.  


## Problèmes rencontrés {#problèmes-rencontrés}
L'organisation du projet est difficile , ceci étant notre premier projet implémentant un service réseau , nous moulinons parfois à réfléchir à notre manière de procéder .  

énormément de conflit sur github, la cause du problème est du au fait que nous travaillons tous sur des projets différents, cela cause des conflits lorsque nous voulons git push alors que nous devons d'abord récupérer les modifications faites par les autres personnes du groupes. Quelques problèmes de code qui ont était éffacer/écraser à cause de git et du git pull, un fichier avait était suprimer nous avons réussis à surmonter alors plus ou moins de difficulté cela nous a permis de comprendre et d'apprendre plus sur git et sur docker. 



## Améliorations possibles {#améliorations-possibles}
Voici quelques améliorations que nous pourrions apporter à notre projet .  

- Certaine règle des echecs non pas vue le jour pendant cette SAE par manque de temps et de compétences :
      - Le Roque
      - Les 3 coups

- Ajouter un timer pour le joueur blanc et un autre pour le joueur noir qui se stoppe quand la personne a déplacé  sa piece.

- Ajouter un chat qui permetterai de parler entre les joueurs et qui permetterai de voir les coups jouer par les deux joueurs.

- déplacer le plateau pour que les couleurs des pions qui est joué par la personnes sois vers lui.

- Ajouter une base de données qui permetterai de sauvegarder les données des joueurs et de créer des nouveaux données pour les personnes qui n'ont jamais joué avec le nombre de partie joué/ nombres de victoires / nombres de défaites / partie joué au total.

- Un affichage pour les victoires/défaites/match null.

- Implémentation d'une possibilité de changer le skin du plateau et des pions.


## Conclusion {#conclusion}
En conclusion, Nous avons eu pas énormément de mal pour commencer l'idée du jeu d'echec nous ai venu assez spontanément. Cependant ne connaissant pas énormément git et docker nous avons passé beaucoup trop de temps dessus ce qui nous a pas permis de finaliser certaine chose que nous aurions aimé faire. Nous trouvons que pour le peu de temps donné, nous avons réussis en partent de rien à faire un super jeu d'echec jouable à deux avec la plus part des règles du jeux donc pour nous cette sae est une sincère et fière réussite.    

