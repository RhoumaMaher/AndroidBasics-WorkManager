# Photo Compression with WorkManager

This project demonstrates how to utilize Android's WorkManager library to perform photo compression in the background. WorkManager provides a reliable way to schedule and execute deferrable, guaranteed tasks, making it an excellent choice for use cases like this one.

## Features

* Background photo compression using CoroutineWorker.

* Flexible task configuration with input and output data.

* Constraint-based execution (e.g., avoiding low storage).

* Live updates on task progress and results.

## How It Works

1. **User Interaction:** The app allows users to share a photo from other apps (a browser for example).

2. **Task Enqueueing:** A OneTimeWorkRequest is created with photo URI and compression threshold as input data.

3. **Photo Compression:** The PhotoCompressionWorker processes the image in the background, compressing it to meet the size threshold.

4. **Result Handling:** Upon task completion, the compressed image is retrieved and displayed in the app.

## Key Components

* **MainActivity:** Manages user interactions, enqueues the work, and observes the task's progress.

* **PhotoCompressionWorker:** Performs the compression logic in the background, leveraging Kotlin Coroutines.


## Setup

1. Clone the repository.

2. Open the project in Android Studio.

3. Build and run the app on an emulator or physical device.

## Learn More

For a detailed explanation of the implementation, including code snippets and a step-by-step guide, check out the [Medium article](https://medium.com/@RhoumaMaher/mastering-workmanager-in-android-a-deep-dive-with-photo-compression-example-3b452f16295c). The article dives deep into WorkManager concepts and provides additional insights into handling background tasks effectively.

## License
This project is licensed under the MIT License. Feel free to use and modify the code for your own projects. Happy coding! If you have any questions or suggestions, feel free to reach out.

* **Medium:** [My Medium Profile](https://medium.com/@RhoumaMaher)
* **LinkedIn:** [My LinkedIn Profile](https://www.linkedin.com/in/maher-rhouma-581919199/).
  
Let’s connect and discuss all things Android!
