package com.example.androidquiz.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizLocalDataSource @Inject constructor() : QuizDataSource {

    override fun getQuestions(): Flow<List<QuizQuestion>> {
        return flowOf(defaultQuestions)
    }
    private val defaultQuestions = listOf(
        QuizQuestion(
            id = 1,
            questionText = "What is an Activity in Android?",
            answerText = "An Activity represents a single screen with a user interface (UI) in an Android app. It's the primary way users interact with your application. For example, an email app might have an activity to show a list of emails, another to compose an email, and a third for reading emails."
        ),
        QuizQuestion(
            id = 2,
            questionText = "What is the purpose of the AndroidManifest.xml file?",
            answerText = "The AndroidManifest.xml file is a crucial part of every Android app. It describes essential information about your app to the Android build tools, the Android operating system, and Google Play. This includes things like the app's package name, components (activities, services, broadcast receivers, content providers), permissions, and hardware/software features required."
        ),
        QuizQuestion(
            id = 3,
            questionText = "What is Jetpack Compose?",
            answerText = "Jetpack Compose is Android's modern toolkit for building native UIs. It simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs. It allows you to build your UI by defining a set of composable functions that describe how your UI should look given the current state."
        ),
        QuizQuestion(
            id = 4,
            questionText = "What is a ViewModel in Android?",
            answerText = "A ViewModel is a class that is responsible for preparing and managing the data for an Activity or a Fragment. It also handles the communication of the Activity/Fragment with the rest of the application (e.g., calling the business logic classes). The ViewModel is designed to store and manage UI-related data in a lifecycle-conscious way, allowing data to survive configuration changes such as screen rotations."
        ),
        QuizQuestion(
            id = 5,
            questionText = "What is a Service in Android?",
            answerText = "A Service is an application component that can perform long-running operations in the background. It does not provide a user interface. For example, a service might play music in the background while the user is in a different application, or it might fetch data over the network without blocking user interaction with an activity."
        ),
        QuizQuestion(
            id = 6,
            questionText = "What is the difference between `==` and `===` in Kotlin?",
            answerText = "In Kotlin, `==` is used for structural equality (checking if the values of two objects are the same, by calling the `equals()` method), while `===` is used for referential equality (checking if two references point to the same object in memory)."
        ),
        QuizQuestion(
            id = 7,
            questionText = "What is a BroadcastReceiver in Android?",
            answerText = "A BroadcastReceiver is an Android component that allows you to register for system or application events. When an event occurs, the Android system notifies registered BroadcastReceivers. For example, you can use a BroadcastReceiver to listen for system boot completion, network connectivity changes, or incoming SMS messages."
        ),
        QuizQuestion(
            id = 8,
            questionText = "What is a ContentProvider in Android?",
            answerText = "A ContentProvider manages access to a central repository of data. It enables applications to share data with other applications. For example, the contacts app uses a ContentProvider to manage contact information, which can then be accessed by other apps with the appropriate permissions."
        ),
        QuizQuestion(
            id = 9,
            questionText = "What are Intents in Android?",
            answerText = "Intents are messaging objects used to request an action from another app component. You can use Intents to start an activity, service, or deliver a message to a broadcast receiver. Intents can be explicit (specifying the target component) or implicit (allowing the system to find a suitable component)."
        ),
        QuizQuestion(
            id = 10,
            questionText = "What is the role of Gradle in Android development?",
            answerText = "Gradle is a build automation tool used to manage dependencies, compile code, and package Android applications (APKs or AABs). It uses a Groovy-based or Kotlin-based DSL (Domain Specific Language) to define build configurations."
        ),
        QuizQuestion(
            id = 11,
            questionText = "What is ADB (Android Debug Bridge)?",
            answerText = "ADB is a versatile command-line tool that lets you communicate with a device (emulator or connected Android device). It allows you to perform actions such as installing and debugging apps, and it provides access to a Unix shell that you can use to run a variety of commands on a device."
        ),
        QuizQuestion(
            id = 12,
            questionText = "What are coroutines in Kotlin?",
            answerText = "Coroutines are a concurrency design pattern that you can use on Android to simplify code that executes asynchronously. They help manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive."
        ),
        QuizQuestion(
            id = 13,
            questionText = "What is the difference between `val` and `var` in Kotlin?",
            answerText = "`val` is used to declare read-only (immutable) variables, similar to `final` in Java. Once a value is assigned to a `val`, it cannot be reassigned. `var` is used to declare mutable variables, meaning their value can be changed after initialization."
        ),
        QuizQuestion(
            id = 14,
            questionText = "What is an Android Fragment?",
            answerText = "A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout, has its own lifecycle, and can handle its own input events. Fragments cannot live on their own—they must be hosted by an activity or another fragment."
        ),
        QuizQuestion(
            id = 15,
            questionText = "What is the purpose of `RecyclerView` in Android?",
            answerText = "`RecyclerView` is a more advanced and flexible version of `ListView`. It is designed to display large data sets efficiently by recycling and reusing views as the user scrolls. This improves performance and reduces memory consumption."
        ),
        QuizQuestion(
            id = 16,
            questionText = "What are Android Architecture Components?",
            answerText = "Android Architecture Components are a collection of libraries that help you design robust, testable, and maintainable apps. Key components include `ViewModel`, `LiveData`, `Room`, `Lifecycle-aware components`, `Navigation`, and `Paging`."
        ),
        QuizQuestion(
            id = 17,
            questionText = "What is the difference between `lateinit` and `lazy` in Kotlin?",
            answerText = "`lateinit` is a modifier for non-null properties that are initialized after object construction. It's often used for properties that will be initialized through dependency injection or in a setup method. If accessed before initialization, it throws an `UninitializedPropertyAccessException`. `lazy` is a delegate for properties whose value is computed only upon first access. It's thread-safe by default and can be used for both `val` and `var` properties (though typically used for `val`). It's suitable for expensive computations or initializations that should be deferred until actually needed."
        ),
        QuizQuestion(
            id = 18,
            questionText = "What do the letters in the SOLID acronym stand for in object-oriented design?",
            answerText = "SOLID is an acronym for five design principles intended to make software designs more understandable, flexible, and maintainable. They are:\n*   **S** - Single Responsibility Principle: A class should have only one reason to change.\n*   **O** - Open/Closed Principle: Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.\n*   **L** - Liskov Substitution Principle: Subtypes must be substitutable for their base types.\n*   **I** - Interface Segregation Principle: No client should be forced to depend on methods it does not use.\n*   **D** - Dependency Inversion Principle: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions."
        ),
        QuizQuestion(
            id = 19,
            questionText = "Explain the Single Responsibility Principle (SRP) with a simple example.",
            answerText = "The SRP states that a class should have only one reason to change, meaning it should have only one job or responsibility. For example, a `UserAuth` class should only handle user authentication (login, logout, registration) and not also user profile management or sending notification emails. Those would be separate responsibilities for other classes like `UserProfileManager` or `NotificationService`."
        ),
        QuizQuestion(
            id = 20,
            questionText = "What is the Open/Closed Principle (OCP) and how does it promote maintainable code?",
            answerText = "The OCP states that software entities (classes, modules, functions) should be open for extension but closed for modification. This means you should be able to add new functionality without changing existing, tested code. It promotes maintainability by reducing the risk of introducing bugs into existing code and making the system more flexible to new requirements, often achieved through abstraction and polymorphism (e.g., using interfaces and allowing new implementations)."
        ),
        QuizQuestion(
            id = 21,
            questionText = "Describe the Liskov Substitution Principle (LSP). What happens if it's violated?",
            answerText = "The LSP states that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program. If a subclass cannot be used wherever its superclass is expected, it violates LSP. Violations can lead to unexpected behavior, runtime errors, and the need for type-checking or conditional logic, making the code less robust and harder to maintain."
        ),
        QuizQuestion(
            id = 22,
            questionText = "What problem does the Interface Segregation Principle (ISP) aim to solve?",
            answerText = "The ISP aims to solve the problem of 'fat' interfaces. It states that no client should be forced to depend on methods it does not use. Instead of one large interface, clients should be able_to depend on smaller, more specific interfaces that cater to their needs. This reduces coupling and makes the system easier to refactor, change, and redeploy."
        ),
        QuizQuestion(
            id = 23,
            questionText = "Explain the Dependency Inversion Principle (DIP). Why is it important for loosely coupled systems?",
            answerText = "The DIP states that high-level modules should not depend on low-level modules; both should depend on abstractions (e.g., interfaces). Furthermore, abstractions should not depend on details; details should depend on abstractions. This is important for loosely coupled systems because it decouples high-level policy from low-level implementation details, making the system more flexible, testable, and maintainable. Changes in low-level modules are less likely to impact high-level modules if they both depend on stable abstractions."
        ),
        QuizQuestion(
            id = 24,
            questionText = "What is a Foreground Service in Android and why is it used?",
            answerText = "A Foreground Service performs operations that are noticeable to the user. They show a persistent notification in the status bar to inform the user that the app is performing a task in the foreground and consuming system resources. Unlike background services, foreground services are less likely to be killed by the system when under low memory conditions. They are used for tasks like playing music, tracking location, or active downloads that the user is actively aware of."
        ),
        QuizQuestion(
            id = 25,
            questionText = "What are the requirements for starting a Foreground Service in recent Android versions (API 26+)?",
            answerText = "Starting from Android 8.0 (API level 26), apps can no longer start background services freely. To start a foreground service, you must call `startForegroundService()` instead of `startService()`. Within five seconds of calling `startForegroundService()`, the service must call its `startForeground()` method, providing a non-null Notification to be displayed to the user and a unique integer ID for the notification. Failure to do so will result in an `ANR (Application Not Responding)` error and the system will stop the service."
        ),
        QuizQuestion(
            id = 26,
            questionText = "How do you stop a Foreground Service, and what happens to its notification?",
            answerText = "A Foreground Service can be stopped by calling `stopSelf()` from within the service itself or `stopService()` from another component. When a foreground service is stopped, its associated notification is also removed by default if `true` is passed to `stopForeground(true)`. If `stopForeground(false)` is called, the notification remains visible after the service is stopped, but it will be removed if the service is later stopped completely or if the app is terminated. The `stopForeground(int flags)` method can also be used, with flags like `Service.STOP_FOREGROUND_REMOVE` (to remove the notification) or `Service.STOP_FOREGROUND_DETACH` (to detach the notification so it can be managed independently, though this is less common)."
        ),
        QuizQuestion(
            id = 27,
            questionText = "What is the `Application` class in Android and what is its primary role?",
            answerText = "The `Application` class is a base class within an Android app that contains global application state. It is instantiated before any other class when the process for your application/package is created. Its primary role is to maintain global application state, handle low-memory situations by overriding `onLowMemory()`, and respond to configuration changes by overriding `onConfigurationChanged()`. It can also be used for initializing global resources like dependency injection libraries or analytics SDKs."
        ),
        QuizQuestion(
            id = 28,
            questionText = "What are the four main types of application components in Android? Briefly describe each.",
            answerText = "The four main types of application components are:\n*   **Activities:** Provide a screen with which users can interact. They are the entry points for interacting with the user.\n*   **Services:** Perform long-running operations in the background or supply functionality for other applications. They do not provide a user interface.\n*   **Broadcast Receivers:** Respond to system-wide broadcast announcements or custom application broadcasts. They act as a gateway to other components or perform small amounts of work.\n*   **Content Providers:** Manage a shared set of application data. They enable applications to store and retrieve data and make it available to other applications (with proper permissions)."
        )
    )
}