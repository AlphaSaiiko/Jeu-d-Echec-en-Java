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
Notre groupe a décidé de nous orienter sur un jeu d'échec, 2 personnes sont habituées à y jouer ce qui allait rendre le back-end plus simple pour eux par rapport à la logique des déplacements des pièces, de plus, à travers le jeu d'échec, nous pouvons balayer beaucoup de notions d'abord vus en développement, et également réutilisé ce que nous avons fait lors des cours de réseaux (Client / Serveur) .  

![image](https://github.com/AlphaSaiiko/docker-sae2.03/assets/150456122/78642b57-b165-447a-84e9-95bd3247291e)



## Organisation et conception {#organisation-et-conception}


Plusieurs idées ont émané avant d'avoir cette idée finale de jeu d'échec, de base, nous voulions faire un jeu un peu plus "costaud" mais par peur de temps nous avons préféré être prudent.  

Pour être le plus efficace possible, nous nous sommes séparés le travail comme ceci e :  


Aubin       : Partie Réseau , s'occupe de l'implémentation du multijoueur (Client/Serveur) et site web ( avec Antoine ) 
Remplissage site internet  

Gestion de la communication controleur serveur  

Travail sur les images  
Création de l'image docker  


Alexandre : Partie front-end , travaille avec Antoine sur l'IHM.  
La "conception" des images
  
Les packages

les panels bas et gauche et droite avec les changements de couleurs

commencement d'un systeme de bado connection , non finalisé

'''Illustration du système de base de donnée (non finalisé)'''

![Capture d'écran 2024-04-16 224946](https://github.com/AlphaSaiiko/docker-sae2.03/assets/166433779/d5ae4f64-9852-442d-a1ad-8935d239c344)

![Capture d'écran 2024-04-16 225038](https://github.com/AlphaSaiiko/docker-sae2.03/assets/166433779/339a50db-347e-44e7-9bf4-6c0e6fbc6eab)
   
Antoine    : Partie front-end , travaille avec Alexandre sur l'IHM.  

Ihm ( plateau avec les lettres et les chiffres )  
Gestion du git / Création github  / création site  


Fanch       : Partie back-end  , travaille sur la partie Métier.  
Les deplacements de toutes les pieces  

Interaction ihm/back-end  

Placements des images et deplacements de celles ci  

Corrections de bugs de back-end/deplacement/manger les pieces  

La partie promotion de piece en local puis en réseau  



## Problèmes rencontrés {#problèmes-rencontrés}

L'organisation du projet est difficile , ceci étant notre premier projet implémentant un service réseau , nous moulinons parfois à réfléchir à notre manière de procéder .  

Énormément de conflit sur github, la cause du problème est dû au fait que nous travaillons tous sur des projets différents, cela cause des conflits lorsque nous voulons git push alors que nous devons d'abord récupérer les modifications faites par les autres personnes du groupe. Quelques problèmes de code qui ont été effacés / écraser à cause de git et du git pull, un fichier avait était supprimer nous avons réussis à surmonter alors plus ou moins de difficultés cela nous a permis de comprendre et d'apprendre plus sur git et sur docker. 

La partie réseau en java a été relativement difficile , la conception était acquise mais l'implémentation a été plus compliqué , beaucoup de documentations ont dû être parcourues et l'IA a pu nous aider à comprendre l'utilité de certaines fonctions .



## Améliorations possibles {#améliorations-possibles}
Voici quelques améliorations que nous pourrions apporter à notre projet.  

- Certaines règles des échecs non pas vue le jour côté "multijoueur" pendant cette SAE par manque de temps et de compétences :
- Le Roque
- Les 3 coups

- Ajouter un timer pour le joueur blanc et un autre pour le joueur noir qui se stoppe quand la personne a déplacé sa pièce. 

- déplacer le plateau pour que les couleurs des pions qui sont joué par la personne soient vers lui.
  
- Ajouter un chat qui permettrait de parler entre les joueurs et qui permettrait de voir les coups jouer par les deux joueurs. ( Lors de différents tests nous faisions communiquer nos consoles )

- Ajouter une base de données qui permettrait de sauvegarder les données des joueurs et de créer des nouvelles données pour les personnes qui n'ont jamais joué avec le nombre de parties joué/nombres de victoires/nombres de défaites/partie joué au total.

- Un affichage pour les victoires/défaites/match null.

- Implémentation d'une possibilité de changer le skin du plateau et des pions.


## Conclusion {#conclusion}
En conclusion, nous n'avons eu pas énormément de mal pour commencer l'idée du jeu d'échec nous ai venu assez spontanément. Cependant ne connaissant pas énormément git et docker nous avons passé beaucoup trop de temps dessus ce qui ne nous a pas permis de finaliser certaines choses que nous aurions aimé faire. Nous trouvons que pour le peu de temps donné, nous avons réussi en partent de rien à faire un super jeu d'échec jouable à deux avec la plupart des règles du jeu donc pour nous cette sae est une sincère et fière réussite.    

