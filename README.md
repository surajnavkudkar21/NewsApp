# NewsApp

NewsApp includes a native Android and a native iOS apps, where the business logic and inftrastructure is shared in a KMP module.

NewsApp is using the news API to fetch, cache and display the top US business articles. It also contains a screen to diaply the list of news sources we use to fetch the articles from.
Finally, it contains third screen to display informartion regarding the user's device.

## Tech Stack
It is a prototype app based on the following technologies and patterns:

1. Clean Architecture
2. MVI
3. Ktor
4. SQL Delight
5. Koin
6. Jetpack Compose
7. Swift UI


## Architectural diagram

The UI/Framework layers reside in the native apps, while everything from the View Model up to Data layer is in the common KMP module.


![287762783-a1a465db-1484-4eb8-ab3c-1d43b457d7c2](https://github.com/user-attachments/assets/b852ae3b-0bd5-49c2-8e62-07cbae45b26e)


## Architectural Layers

<img width="531" alt="Screenshot 2023-12-04 at 18 19 53" src="<img width="531" alt="287763244-620fb7ca-68cb-428c-b134-4a012a8836eb" src="https://github.com/user-attachments/assets/9cd1216d-c59a-4c58-9fbb-6a6f1d84cceb" />
">



