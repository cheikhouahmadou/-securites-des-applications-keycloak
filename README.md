"# -securites-des-applications-keycloak" 

 La commande Docker est utilisée pour démarrer un conteneur Keycloak avec des variables 
 d'environnement pour le nom d'utilisateur et le mot de passe administrateu
 
 
 ![C01](https://github.com/user-attachments/assets/ed55e958-22d7-4ebf-87f4-8d8af0be0550)


Le conteneur Docker nommé "hungry_rhodes" exécute Keycloak avec le port 8080 exposé.

![C02](https://github.com/user-attachments/assets/9f2aec14-1462-4023-8d20-480f8dc799e4)


 L'interface de connexion à Keycloak demande un nom d'utilisateur et un mot de passe pour accéder au compte administrateur.
 

![C03](https://github.com/user-attachments/assets/301390fc-553a-40d8-a6b9-9a547dfc4b8b)


L'interface d'administration de Keycloak affiche la liste des clients configurés et permet de gérer leurs paramètres.

![C04](https://github.com/user-attachments/assets/70e7a9a6-1a09-41b7-9a9b-3ba44e93c6de)


 La section des scopes de clients dans Keycloak montre les rôles disponibles et leurs descriptions.


 ![C06](https://github.com/user-attachments/assets/01a70d44-5f07-4230-818d-ae2bdc111604)


 Un tableau répertorie les utilisateurs, leurs rôles, adresses e-mail et noms dans l'interface d'administration de Keycloak.

 
![C05](https://github.com/user-attachments/assets/b38c637f-65f1-49c3-bf5b-b4b2a1318ad2)


Structure du projet

![C07](https://github.com/user-attachments/assets/242ca36c-c30e-49b9-8ae8-208831f15c87)


issuer-uri : L'URL de l'émetteur des tokens JWT (Keycloak), pointant vers le Realm SpringSecurityKeycloakRealm.
jwk-set-uri : L'URL pour récupérer les clés publiques qui permettent de vérifier les JWT signés par Keycloak.


![C08](https://github.com/user-attachments/assets/66626ef4-7275-4f3b-af22-7b8acc30ba8e)


L'utilisateur lamine peut voir la liste en utilisant son token
l'utilisatuer cheikhou role admin peut acceder sur (/admin) pour creer un produit


![C09](https://github.com/user-attachments/assets/d0b3a733-4e15-4587-8481-3740ea8a5277)


![C10](https://github.com/user-attachments/assets/8df63b53-c87f-4bab-b050-2fa50262c754)


Test sur postman 

![C11](https://github.com/user-attachments/assets/99558ac6-d3ce-446c-a557-abb445adcdb7)


![C12](https://github.com/user-attachments/assets/13baa7df-0a79-44da-bf65-69b72ad3d8b5)


![C13](https://github.com/user-attachments/assets/e765a7d5-4bc2-4c52-9cab-979ef16b0d47)


![C14](https://github.com/user-attachments/assets/999d0d90-52fc-414d-a21c-fc3f82aa34b8)






