## iOS and Android App Screenshots

<img width="857" alt="Screenshot 2025-01-08 at 11 21 16 AM" src="https://github.com/user-attachments/assets/495bb1cd-5898-4518-b0ca-f0355b6170ff" />

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

<img width="531" alt="287763244-620fb7ca-68cb-428c-b134-4a012a8836eb" src="https://github.com/user-attachments/assets/9cd1216d-c59a-4c58-9fbb-6a6f1d84cceb" />

# License

This project is licensed under the MIT License. See the LICENSE file for details.

# Acknowledgements

    News API for providing the news data.
    JetBrains for Kotlin and related tooling.
    The open-source community for various libraries and inspiration.
