
#Description : 

    Ce projet Spring Boot est une application de gestion et d'attribution des formations au sein d'une entreprise. 

#Types d'Utilisateurs : 

    Admin :
    Peut gérer tous les aspects du système.
    Capable d'ajouter, de modifier et de supprimer des formateurs et des employés.
    Peut attribuer des formations a des employés.

    Formateur :
    Responsable de la création et de la gestion des contenus des formations.
    Interagit avec les employés pour répondre à leurs questions et les guider.

    Employé :
    Peut s'inscrire et participer à des formations.
    A accès à ses propres données de formation et peut communiquer avec les formateurs pour obtenir de l'aide.

#Prérequis
    
    Java JDK 11 ou supérieur
    Maven 3.6 ou supérieur
    Visual Studio Code (VSCode) ou tout autre IDE
    XAMPP pour la gestion des serveurs Apache et MySQL
    Postman pour tester les services REST

#Installation et Lancement

    Cloner le projet:
    Clonez ce projet en utilisant la commande suivante dans votre terminal 
    git clone [URL du dépôt Git]
    cd [nom du répertoire du projet]

    Configurer la base de données avec XAMPP:
    Lancez XAMPP et démarrez les serveurs Apache et MySQL.
    Utilisez phpMyAdmin ou un autre outil de gestion de base de données pour créer une nouvelle base de données pour l'application.
    Configurez votre base de données en modifiant le fichier src\main\resources\application.properties.

    Construire et lancer l'application avec VSCode:
    Ouvrez le dossier du projet dans VSCode.
    Ouvrez un terminal intégré dans VSCode.
    Exécutez les commandes suivantes pour construire et lancer l'application :
        mvn clean install
        mvn spring-boot:run
         ou 
        Faites un clic droit sur le fichier principale de l'application : src\main\java\wafa\finetude\formation\FormationApplication.java .
        Choisissez "Run Java" dans le menu contextuel. Ceci lancera l'application Spring Boot.
    L'application sera lancée et accessible à l'adresse http://localhost:8080.

#Tester les services avec Postman

    Ouvrez Postman.
    Configurez les requêtes HTTP (GET, POST, PUT, DELETE) pour interagir avec l'application.  exemple d'URL:
    GET  http://localhost:8080/formations/admin : demander une liste de tous les administrateur
    POST   http://localhost:8080/formations/admin  et ajoutez les données nécessaires dans le corps de la requête sous format JSON. 

#Structure du projet

    src\main\java\wafa\finetude\formation\entities : Classes d'entités pour la représentation des tables de base de données.
    src\main\java\wafa\finetude\formation\repos : Interfaces JPA Repository pour l'accès aux données.
    src\main\java\wafa\finetude\formation\restcontrollers : Contrôleurs pour gérer les requêtes HTTP.
    src\main\java\wafa\finetude\formation\service Classes de service pour la logique métier.
    src\main\java\wafa\finetude\formation\security: Contient les configurations et les classes liées à la sécurité de l'authentification et l'autorisation.
    src/test : Contient les tests unitaires et d'intégration pour assurer la qualité et la fiabilité du code.   
    src\main\resources: Fichiers de configuration de l'application.


