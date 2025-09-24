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
            answerText = "An Activity represents a single screen with a user interface (UI) in an Android app. It's the primary way users interact with your application. For example, an email app might have an activity to show a list of emails, another to compose an email, and a third for reading emails.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 2,
            questionText = "What is the purpose of the AndroidManifest.xml file?",
            answerText = "The AndroidManifest.xml file is a crucial part of every Android app. It describes essential information about your app to the Android build tools, the Android operating system, and Google Play. This includes things like the app's package name, components (activities, services, broadcast receivers, content providers), permissions, and hardware/software features required.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 3,
            questionText = "What is Jetpack Compose?",
            answerText = "Jetpack Compose is Android's modern toolkit for building native UIs. It simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs. It allows you to build your UI by defining a set of composable functions that describe how your UI should look given the current state.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            id = 4,
            questionText = "What is a ViewModel in Android?",
            answerText = "A ViewModel is a class that is responsible for preparing and managing the data for an Activity or a Fragment. It also handles the communication of the Activity/Fragment with the rest of the application (e.g., calling the business logic classes). The ViewModel is designed to store and manage UI-related data in a lifecycle-conscious way, allowing data to survive configuration changes such as screen rotations.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            id = 5,
            questionText = "What is a Service in Android?",
            answerText = "A Service is an application component that can perform long-running operations in the background. It does not provide a user interface. For example, a service might play music in the background while the user is in a different application, or it might fetch data over the network without blocking user interaction with an activity.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 6,
            questionText = "What is the difference between `==` and `===` in Kotlin?",
            answerText = "In Kotlin, `==` is used for structural equality (checking if the values of two objects are the same, by calling the `equals()` method), while `===` is used for referential equality (checking if two references point to the same object in memory).",
            category = QuizCategory.Kotlin
        ),
        QuizQuestion(
            id = 7,
            questionText = "What is a BroadcastReceiver in Android?",
            answerText = "A BroadcastReceiver is an Android component that allows you to register for system or application events. When an event occurs, the Android system notifies registered BroadcastReceivers. For example, you can use a BroadcastReceiver to listen for system boot completion, network connectivity changes, or incoming SMS messages.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 8,
            questionText = "What is a ContentProvider in Android?",
            answerText = "A ContentProvider manages access to a central repository of data. It enables applications to share data with other applications. For example, the contacts app uses a ContentProvider to manage contact information, which can then be accessed by other apps with the appropriate permissions.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 9,
            questionText = "What are Intents in Android?",
            answerText = "Intents are messaging objects used to request an action from another app component. You can use Intents to start an activity, service, or deliver a message to a broadcast receiver. Intents can be explicit (specifying the target component) or implicit (allowing the system to find a suitable component).",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 10,
            questionText = "What is the role of Gradle in Android development?",
            answerText = "Gradle is a build automation tool used to manage dependencies, compile code, and package Android applications (APKs or AABs). It uses a Groovy-based or Kotlin-based DSL (Domain Specific Language) to define build configurations.",
            category = QuizCategory.BuildAndTools
        ),
        QuizQuestion(
            id = 11,
            questionText = "What is ADB (Android Debug Bridge)?",
            answerText = "ADB is a versatile command-line tool that lets you communicate with a device (emulator or connected Android device). It allows you to perform actions such as installing and debugging apps, and it provides access to a Unix shell that you can use to run a variety of commands on a device.",
            category = QuizCategory.BuildAndTools
        ),
        QuizQuestion(
            id = 12,
            questionText = "What are coroutines in Kotlin?",
            answerText = "Coroutines are a concurrency design pattern that you can use on Android to simplify code that executes asynchronously. They help manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive.",
            category = QuizCategory.Coroutines
        ),
        QuizQuestion(
            id = 13,
            questionText = "What is the difference between `val` and `var` in Kotlin?",
            answerText = "`val` is used to declare read-only (immutable) variables, similar to `final` in Java. Once a value is assigned to a `val`, it cannot be reassigned. `var` is used to declare mutable variables, meaning their value can be changed after initialization.",
            category = QuizCategory.Kotlin
        ),
        QuizQuestion(
            id = 14,
            questionText = "What is an Android Fragment?",
            answerText = "A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout, has its own lifecycle, and can handle its own input events. Fragments cannot live on their own—they must be hosted by an activity or another fragment.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 15,
            questionText = "What is the purpose of `RecyclerView` in Android?",
            answerText = "`RecyclerView` is a more advanced and flexible version of `ListView`. It is designed to display large data sets efficiently by recycling and reusing views as the user scrolls. This improves performance and reduces memory consumption.",
            category = QuizCategory.AndroidUI
        ),
        QuizQuestion(
            id = 16,
            questionText = "What are Android Architecture Components?",
            answerText = "Android Architecture Components are a collection of libraries that help you design robust, testable, and maintainable apps. Key components include `ViewModel`, `LiveData`, `Room`, `Lifecycle-aware components`, `Navigation`, and `Paging`.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            id = 17,
            questionText = "What is the difference between `lateinit` and `lazy` in Kotlin?",
            answerText = "`lateinit` is a modifier for non-null properties that are initialized after object construction. It's often used for properties that will be initialized through dependency injection or in a setup method. If accessed before initialization, it throws an `UninitializedPropertyAccessException`. `lazy` is a delegate for properties whose value is computed only upon first access. It's thread-safe by default and can be used for both `val` and `var` properties (though typically used for `val`). It's suitable for expensive computations or initializations that should be deferred until actually needed.",
            category = QuizCategory.Kotlin
        ),
        QuizQuestion(
            id = 18,
            questionText = "What do the letters in the SOLID acronym stand for in object-oriented design?",
            answerText = "SOLID is an acronym for five design principles intended to make software designs more understandable, flexible, and maintainable. They are:\n*   **S** - Single Responsibility Principle: A class should have only one reason to change.\n*   **O** - Open/Closed Principle: Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.\n*   **L** - Liskov Substitution Principle: Subtypes must be substitutable for their base types.\n*   **I** - Interface Segregation Principle: No client should be forced to depend on methods it does not use.\n*   **D** - Dependency Inversion Principle: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.",
            category = QuizCategory.SolidPrinciples
        ),
        QuizQuestion(
            id = 19,
            questionText = "Explain the Single Responsibility Principle (SRP) with a simple example.",
            answerText = "The SRP states that a class should have only one reason to change, meaning it should have only one job or responsibility. For example, a `UserAuth` class should only handle user authentication (login, logout, registration) and not also user profile management or sending notification emails. Those would be separate responsibilities for other classes like `UserProfileManager` or `NotificationService`.",
            category = QuizCategory.SolidPrinciples
        ),
        QuizQuestion(
            id = 20,
            questionText = "What is the Open/Closed Principle (OCP) and how does it promote maintainable code?",
            answerText = "The OCP states that software entities (classes, modules, functions) should be open for extension but closed for modification. This means you should be able to add new functionality without changing existing, tested code. It promotes maintainability by reducing the risk of introducing bugs into existing code and making the system more flexible to new requirements, often achieved through abstraction and polymorphism (e.g., using interfaces and allowing new implementations).",
            category = QuizCategory.SolidPrinciples
        ),
        QuizQuestion(
            id = 21,
            questionText = "Describe the Liskov Substitution Principle (LSP). What happens if it's violated?",
            answerText = "The LSP states that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program. If a subclass cannot be used wherever its superclass is expected, it violates LSP. Violations can lead to unexpected behavior, runtime errors, and the need for type-checking or conditional logic, making the code less robust and harder to maintain.",
            category = QuizCategory.SolidPrinciples
        ),
        QuizQuestion(
            id = 22,
            questionText = "What problem does the Interface Segregation Principle (ISP) aim to solve?",
            answerText = "The ISP aims to solve the problem of 'fat' interfaces. It states that no client should be forced to depend on methods it does not use. Instead of one large interface, clients should be able_to depend on smaller, more specific interfaces that cater to their needs. This reduces coupling and makes the system easier to refactor, change, and redeploy.",
            category = QuizCategory.SolidPrinciples
        ),
        QuizQuestion(
            id = 23,
            questionText = "Explain the Dependency Inversion Principle (DIP). Why is it important for loosely coupled systems?",
            answerText = "The DIP states that high-level modules should not depend on low-level modules; both should depend on abstractions (e.g., interfaces). Furthermore, abstractions should not depend on details; details should depend on abstractions. This is important for loosely coupled systems because it decouples high-level policy from low-level implementation details, making the system more flexible, testable, and maintainable. Changes in low-level modules are less likely to impact high-level modules if they both depend on stable abstractions.",
            category = QuizCategory.SolidPrinciples
        ),
        QuizQuestion(
            id = 24,
            questionText = "What is a Foreground Service in Android and why is it used?",
            answerText = "A Foreground Service performs operations that are noticeable to the user. They show a persistent notification in the status bar to inform the user that the app is performing a task in the foreground and consuming system resources. Unlike background services, foreground services are less likely to be killed by the system when under low memory conditions. They are used for tasks like playing music, tracking location, or active downloads that the user is actively aware of.",
            category = QuizCategory.AndroidAdvancedTopics
        ),
        QuizQuestion(
            id = 25,
            questionText = "What are the requirements for starting a Foreground Service in recent Android versions (API 26+)?",
            answerText = "Starting from Android 8.0 (API level 26), apps can no longer start background services freely. To start a foreground service, you must call `startForegroundService()` instead of `startService()`. Within five seconds of calling `startForegroundService()`, the service must call its `startForeground()` method, providing a non-null Notification to be displayed to the user and a unique integer ID for the notification. Failure to do so will result in an `ANR (Application Not Responding)` error and the system will stop the service.",
            category = QuizCategory.AndroidAdvancedTopics
        ),
        QuizQuestion(
            id = 26,
            questionText = "How do you stop a Foreground Service, and what happens to its notification?",
            answerText = "A Foreground Service can be stopped by calling `stopSelf()` from within the service itself or `stopService()` from another component. When a foreground service is stopped, its associated notification is also removed by default if `true` is passed to `stopForeground(true)`. If `stopForeground(false)` is called, the notification remains visible after the service is stopped, but it will be removed if the service is later stopped completely or if the app is terminated. The `stopForeground(int flags)` method can also be used, with flags like `Service.STOP_FOREGROUND_REMOVE` (to remove the notification) or `Service.STOP_FOREGROUND_DETACH` (to detach the notification so it can be managed independently, though this is less common).",
            category = QuizCategory.AndroidAdvancedTopics
        ),
        QuizQuestion(
            id = 27,
            questionText = "What is the `Application` class in Android and what is its primary role?",
            answerText = "The `Application` class is a base class within an Android app that contains global application state. It is instantiated before any other class when the process for your application/package is created. Its primary role is to maintain global application state, handle low-memory situations by overriding `onLowMemory()`, and respond to configuration changes by overriding `onConfigurationChanged()`. It can also be used for initializing global resources like dependency injection libraries or analytics SDKs.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 28,
            questionText = "What are the four main types of application components in Android? Briefly describe each.",
            answerText = "The four main types of application components are:\n*   **Activities:** Provide a screen with which users can interact. They are the entry points for interacting with the user.\n*   **Services:** Perform long-running operations in the background or supply functionality for other applications. They do not provide a user interface.\n*   **Broadcast Receivers:** Respond to system-wide broadcast announcements or custom application broadcasts. They act as a gateway to other components or perform small amounts of work.\n*   **Content Providers:** Manage a shared set of application data. They enable applications to store and retrieve data and make it available to other applications (with proper permissions).",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 29,
            questionText = "What is a `CoroutineScope` and why is it important?",
            answerText = "A `CoroutineScope` defines the lifecycle of coroutines. It keeps track of all coroutines launched within it. When the scope is cancelled, all coroutines launched within it are also cancelled. This is crucial for avoiding memory leaks and ensuring that coroutines don't outlive their intended lifecycle (e.g., an Activity or ViewModel).",
            category = QuizCategory.Coroutines
        ),
        QuizQuestion(
            id = 30,
            questionText = "What are `Dispatchers` in Kotlin Coroutines and what are the common types?",
            answerText = "`Dispatchers` determine the thread or thread pool on which a coroutine runs. Common types include: `Dispatchers.Main` (for UI-related tasks), `Dispatchers.IO` (for network or disk operations), and `Dispatchers.Default` (for CPU-intensive tasks).",
            category = QuizCategory.Coroutines
        ),
        QuizQuestion(
            id = 31,
            questionText = "What is the difference between `launch` and `async` in Kotlin Coroutines?",
            answerText = "`launch` starts a new coroutine for \"fire-and-forget\" tasks that don't return a result. It returns a `Job`. `async` starts a new coroutine that computes a result and returns a `Deferred<T>`. You can get the result by calling `.await()` on the `Deferred` object.",
            category = QuizCategory.Coroutines
        ),
        QuizQuestion(
            id = 32,
            questionText = "How can you handle exceptions in Kotlin Coroutines?",
            answerText = "Exceptions can be handled using standard `try-catch` blocks within the coroutine. For more global handling or in specific scenarios, a `CoroutineExceptionHandler` can be attached to the `CoroutineContext` to catch uncaught exceptions.",
            category = QuizCategory.Coroutines
        ),
        QuizQuestion(
            id = 33,
            questionText = "What are extension functions in Kotlin and how are they useful?",
            answerText = "Extension functions allow you to add new functions to existing classes without inheriting from them or using design patterns like Decorator. This is useful for adding utility functions to framework classes or your own classes, making code more readable and concise. For example, you could add an extension function `String.isValidEmail()` to validate email strings.",
            category = QuizCategory.Kotlin
        ),
        QuizQuestion(
            id = 34,
            questionText = "Explain the concept of null safety in Kotlin. What is the difference between `?` and `!!` operators?",
            answerText = "Kotlin's type system aims to eliminate the danger of null references from code, also known as the \"billion-dollar mistake\".\n*   `?` (Safe Call Operator): Allows you to access properties or call functions on a nullable reference. If the reference is null, the expression evaluates to null instead of throwing a `NullPointerException`. Example: `nullableString?.length`\n*   `!!` (Not-Null Assertion Operator): Converts any value to a non-null type and throws a `NullPointerException` if the value is null. It should be used when you are certain that a value will not be null. Example: `nullableString!!.length` (throws NPE if `nullableString` is null). It's generally advised to use this operator sparingly.",
            category = QuizCategory.Kotlin
        ),
        QuizQuestion(
            id = 35,
            questionText = "What are Kotlin's scope functions (`let`, `run`, `with`, `apply`, `also`) and what is a common use case for `apply`?",
            answerText = "Kotlin's scope functions execute a block of code within the context of an object. They help write more concise code.\n*   `let`: Object as `it`, returns lambda result. Good for null checks or transformations.\n*   `run`: Object as `this`, returns lambda result. Good for object initialization and computation.\n*   `with`: Object as argument, `this` in lambda, returns lambda result. Good for calling multiple methods on an object.\n*   `apply`: Object as `this`, returns the object itself. Common for object configuration (e.g., `Intent().apply { action = \"ACTION_VIEW\"; putExtra(\"key\", \"value\") }`).\n*   `also`: Object as `it`, returns the object itself. Good for side effects like logging or adding to a collection.",
            category = QuizCategory.Kotlin
        ),
        QuizQuestion(
            id = 36,
            questionText = "What is the difference between `LiveData` and `StateFlow` in Android, and when might you prefer `StateFlow`?",
            answerText = "Both are observable data holders.\n*   `LiveData`: Android lifecycle-aware, updates only active observers, main thread observation, part of Android Architecture Components.\n*   `StateFlow`: Kotlin Flow, emits current and new state updates. Not inherently lifecycle-aware (requires `lifecycleScope` or `flowWithLifecycle`). More flexible for non-UI layers, always has an initial value, and replays the last value.\n*   Prefer `StateFlow` in Kotlin-centric projects for ViewModels, due to better coroutine/Flow integration. `LiveData` can be useful for Java interop or simpler lifecycle needs.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            id = 37,
            questionText = "What are data classes in Kotlin, and what benefits do they provide?",
            answerText = "Data classes are classes primarily used to hold data. The Kotlin compiler automatically generates:\n*   `equals()`/`hashCode()`\n*   `toString()` (e.g., \"User(name=John, age=30)\")\n*   `componentN()` functions (for destructuring)\n*   `copy()` function (to copy instances, optionally changing properties).\n*   Benefits: They significantly reduce boilerplate code, making classes for data storage more concise and readable.",
            category = QuizCategory.Kotlin
        ),
        QuizQuestion(
            id = 38,
            questionText = "What is the Room Persistence Library and why is it recommended for local data storage in Android?",
            answerText = "Room is an abstraction layer over SQLite that allows for more robust database access while harnessing the full power of SQLite. It's recommended because it provides compile-time verification of SQL queries, reduces boilerplate code, and integrates well with other Architecture Components like LiveData and Flow.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            id = 39,
            questionText = "What is the Navigation Component in Android Jetpack and what problem does it solve?",
            answerText = "The Navigation Component is part of Android Jetpack and helps implement navigation in an Android app, from simple button clicks to more complex patterns like app bars and the navigation drawer. It simplifies implementing navigation by providing a visual editor to define navigation graphs, handles Fragment transactions, deep linking, and argument passing between destinations, thus reducing boilerplate and potential errors.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            id = 40,
            questionText = "Explain the concept of `Context` in Android. What are the different types of `Context` and when might you use them?",
            answerText = "`Context` is an interface to global information about an application environment. It allows access to application-specific resources and classes, as well as up-calls for application-level operations such as launching activities, broadcasting and receiving intents, etc. Different types include:\n*   `Application Context`: Tied to the lifecycle of the application. Use it when you need a context whose lifecycle is separate from the current Activity or when passing a context to objects that live beyond an Activity.\n*   `Activity Context`: Available in an Activity and tied to its lifecycle. Use it for UI-related operations like creating Views, Toasts, or Dialogs.\n*   `Service Context`: Available in a Service and tied to its lifecycle.\n*   `BroadcastReceiver Context`: Provided in `onReceive()` and valid only during that call.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 41,
            questionText = "What is the difference between `SharedPreferences` and `DataStore` for storing simple key-value data in Android, and why might `DataStore` be preferred?",
            answerText = "`SharedPreferences` is an older API for storing small amounts of primitive data in key-value pairs. It operates on the UI thread for read/write operations (can cause ANRs), lacks type safety, and doesn't provide a way to signal completion or errors for asynchronous operations. `DataStore` is a newer, more robust data storage solution from Jetpack. It comes in two implementations: `Preferences DataStore` (stores key-value pairs with improvements over SharedPreferences) and `Proto DataStore` (stores typed objects backed by protocol buffers). `DataStore` is preferred because it's asynchronous (using Kotlin Coroutines and Flow), provides type safety (especially Proto DataStore), handles data migration from SharedPreferences, and offers error signaling.",
            category = QuizCategory.AndroidAdvancedTopics
        ),
        QuizQuestion(
            id = 42,
            questionText = "How does Jetpack Compose handle UI state and recomposition? Explain the concept of `@Composable` functions and `remember`.",
            answerText = "Jetpack Compose is a declarative UI toolkit. `@Composable` functions are special Kotlin functions that describe how your UI should look for a given state. They can call other `@Composable` functions to build a UI hierarchy. UI state is any data that can change over time and affect the UI; in Compose, state is typically held in `MutableState` objects (e.g., `mutableStateOf()`). When the state a `@Composable` function reads changes, Compose automatically re-invokes (recomposes) that function and any other composables that also read that state, updating only the necessary parts of the UI. `remember` is used to preserve state across recompositions (e.g., user input in a TextField, or a counter). It stores an object in memory during the initial composition and returns the stored value during recompositions. If `remember` is not used, the state would be reset every time the composable is recomposed.",
            category = QuizCategory.JetpackComponents
        ),
        QuizQuestion(
            id = 43,
            questionText = "What are WorkManager's advantages for deferrable background tasks, and how does it ensure task execution even if the app closes or the device restarts?",
            answerText = "WorkManager is an Android Jetpack library for managing deferrable, guaranteed background work. Advantages include: **Guaranteed Execution:** Tasks are guaranteed to run even if the app exits or the device restarts (by persisting work requests in an internal database). **Backward Compatibility:** Works on devices with or without Google Play Services, choosing an appropriate underlying job scheduler (JobScheduler, Firebase JobDispatcher, or AlarmManager). **Constraints:** Allows specifying conditions for work execution (e.g., network availability, charging status, storage space). **Chaining:** Supports complex work sequences, including parallel and sequential tasks. **Observable:** Provides `LiveData` or `Flow` to observe work status. **Flexible Retries:** Configurable retry policies. It ensures execution after app close/device restart by scheduling tasks with the system and persisting their definitions.",
            category = QuizCategory.AndroidAdvancedTopics
        ),
        QuizQuestion(
            id = 44,
            questionText = "Explain the concept of Dependency Injection (DI) and how it's beneficial in Android development. Mention a popular DI framework for Android.",
            answerText = "Dependency Injection is a design pattern where an object receives its dependencies from an external source rather than creating them itself. Benefits in Android include: **Decoupling:** Reduces coupling between components, making code more modular and easier to manage. **Testability:** Simplifies unit testing by allowing easy replacement of dependencies with mock objects. **Reusability:** Components become more reusable as they are not tied to specific implementations of their dependencies. **Readability/Maintainability:** Makes code easier to understand and maintain by clearly defining dependencies. **Lifecycle Management (with DI frameworks):** Frameworks can manage the lifecycle of injected objects, especially useful in Android's component lifecycle. A popular DI framework for Android is Hilt (built on Dagger), which simplifies DI implementation in Android apps.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 45,
            questionText = "What is ProGuard (or R8 in newer Android Gradle Plugin versions), and why is it important for Android release builds?",
            answerText = "ProGuard (or R8, which is the default in AGP 3.4.0+) is a command-line tool that shrinks, optimizes, and obfuscates Java bytecode. In Android development, it's primarily used for:\n*   **Shrinking (Tree Shaking):** It removes unused classes, fields, methods, and attributes from your packaged app, including those from included code libraries. This significantly reduces the size of your APK or AAB.\n*   **Optimization:** It analyzes and optimizes the bytecode, making the app run more efficiently. This can involve inlining methods, removing dead code, and other bytecode-level improvements.\n*   **Obfuscation:** It renames the remaining classes, fields, and methods using short, meaningless names (e.g., `a`, `b`, `c`). This makes it much harder for others to reverse-engineer your app.\nIt is important for release builds because it helps to reduce the app size, improve runtime performance, and protect your intellectual property by making the code difficult to understand if decompiled.",
            category = QuizCategory.BuildAndTools
        ),
        QuizQuestion(
            id = 46,
            questionText = "How can you optimize loading large bitmaps in Android to avoid `OutOfMemoryError`?",
            answerText = "1. **Load Scaled Bitmaps:** Read the bitmap dimensions first by setting `BitmapFactory.Options.inJustDecodeBounds = true`. Then, calculate an appropriate `BitmapFactory.Options.inSampleSize` to load a scaled-down version of the image into memory that matches the display dimensions, significantly reducing memory usage. After calculating `inSampleSize`, set `inJustDecodeBounds = false` and decode the bitmap. 2. **Use Image Loading Libraries:** Libraries like Glide, Coil, or Picasso are highly recommended. They automatically handle bitmap caching (memory and disk), downsampling, transformations, and efficient loading, abstracting away many complexities and reducing the risk of `OutOfMemoryError`. 3. **Recycle Bitmaps (Carefully):** For manually managed `Bitmap` objects, especially in older code or specific low-level scenarios, call `bitmap.recycle()` when it's no longer needed to free up native memory. However, this is error-prone and less necessary with modern Android versions and image loading libraries, which often manage this. 4. **Use Appropriate Bitmap Configuration:** Choose a `Bitmap.Config` that suits your needs. For example, `Bitmap.Config.RGB_565` uses 2 bytes per pixel instead of 4 bytes for `Bitmap.Config.ARGB_8888`, which can halve memory usage if alpha transparency is not required. 5. **Handle Large Images in Background Threads:** Perform bitmap decoding and processing off the main UI thread (e.g., using coroutines or other threading mechanisms) to prevent ANRs.",
            category = QuizCategory.AndroidAdvancedTopics
        ),
        QuizQuestion(
            id = 47,
            questionText = "Describe the Activity lifecycle in Android and the significance of key callback methods like `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, and `onDestroy()`.",
            answerText = "The Activity lifecycle defines the different states an Activity can be in during its lifetime. Key callbacks include:\n*   `onCreate()`: Called when the activity is first created. Used for essential initialization, layout inflation, and restoring saved state.\n*   `onStart()`: Called when the activity becomes visible to the user.\n*   `onResume()`: Called when the activity will start interacting with the user. The activity is at the top of the activity stack.\n*   `onPause()`: Called when the system is about to pause the activity, often when another activity comes to the foreground. Release resources that should not be held while paused (e.g., camera, sensors) and save any persistent state.\n*   `onStop()`: Called when the activity is no longer visible to the user. Perform more significant resource cleanup. The activity may be destroyed or restarted.\n*   `onRestart()`: Called when an activity that was previously stopped is being started again.\n*   `onDestroy()`: Called before the activity is destroyed. Perform final cleanup of all resources. This can happen either because the activity is finishing (due to `finish()` being called) or because the system is temporarily destroying this instance of the activity to save space.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 48,
            questionText = "What is an `ANR (Application Not Responding)` error in Android, and what are common causes and ways to prevent it?",
            answerText = "An ANR occurs when the UI thread (main thread) of an Android app is blocked for too long (typically 5 seconds for an Activity or BroadcastReceiver, 20 seconds for a Service). This prevents the app from responding to user input or drawing updates, leading to a system dialog offering to close the app.\nCommon causes:\n*   Performing long-running operations (network requests, database operations, complex calculations) on the main thread.\n*   Slow operations within BroadcastReceiver's `onReceive()` method.\n*   Deadlocks between threads.\nWays to prevent ANRs:\n*   Move long-running tasks off the main thread using Kotlin Coroutines, Threads, WorkManager, or RxJava.\n*   Keep BroadcastReceiver's `onReceive()` lightweight; delegate complex work to a Service or WorkManager.\n*   Optimize code for performance, especially in UI rendering and event handling.\n*   Be cautious with synchronization and locking to avoid deadlocks.",
            category = QuizCategory.AndroidAdvancedTopics
        ),
        QuizQuestion(
            id = 49,
            questionText = "Explain the difference between `Serializable` and `Parcelable` in Android. Which one is generally preferred for passing data between components and why?",
            answerText = "Both `Serializable` and `Parcelable` are interfaces that allow objects to be marshalled and unmarshalled (converted into a stream of bytes and back) for inter-process communication or persistence.\n*   `Serializable`: A standard Java marker interface. It\'s easier to implement as it requires minimal code (just `implements Serializable`) and uses reflection, which can be slow.\n*   `Parcelable`: An Android-specific interface. It requires more explicit boilerplate code to implement (`writeToParcel()` and a `CREATOR` field), but it\'s much faster and more efficient than `Serializable` because it avoids reflection and is designed for Android's IPC mechanisms (like Intents).\n`Parcelable` is generally preferred in Android for passing data between components (e.g., in Intents or Bundles) due to its significantly better performance.",
            category = QuizCategory.AndroidFundamentals
        ),
        QuizQuestion(
            id = 50,
            questionText = "What are Build Variants in Android, and how can they be used to manage different versions of your app (e.g., debug vs. release, free vs. paid)?",
            answerText = "Build Variants are the result of combining Build Types and Product Flavors.\n*   **Build Types:** Define how your app is built and packaged, typically `debug` and `release`. You can configure properties like `debuggable`, `minifyEnabled` (for code shrinking/obfuscation), signing configurations, etc.\n*   **Product Flavors:** Allow you to create different versions of your app from the same codebase. For example, \"free\" vs. \"paid\", or different branding for various clients. Each flavor can have its own source code, resources, and configurations (e.g., application ID, API endpoints, icons).\nBy combining build types and product flavors, Gradle generates different build variants (e.g., `freeDebug`, `freeRelease`, `paidDebug`, `paidRelease`). This allows developers to easily manage and build multiple distinct versions of their app from a single project, each with potentially different features, resources, or configurations.",
            category = QuizCategory.BuildAndTools
        ),
        QuizQuestion(
            id = 51,
            questionText = "What is structured concurrency in Kotlin Coroutines, and what are its benefits?",
            answerText = "Structured concurrency is a programming paradigm that ensures coroutines are launched within a specific `CoroutineScope` and that their lifecycles are managed by that scope. When a scope is cancelled, all coroutines launched within it are automatically cancelled. Benefits include:\n*   **Leak Prevention:** Prevents coroutines from leaking (running indefinitely when they are no longer needed).\n*   **Error Handling:** Simplifies error propagation; an exception in a child coroutine typically cancels its parent and siblings (unless handled).\n*   **Clarity:** Makes the parent-child relationship and lifecycle of coroutines clear.\n*   **Testability:** Easier to manage and test coroutines within defined scopes.",
            category = QuizCategory.Coroutines
        ),
        QuizQuestion(
            id = 52,
            questionText = "Explain the roles of `Job` and `Deferred` in Kotlin Coroutines. How do they relate to `launch` and `async`?",
            answerText = "`Job`: Represents a cancellable piece of work initiated by `launch`. It doesn't produce a result value. It can be used to manage the lifecycle of a coroutine (e.g., wait for its completion using `join()` or cancel it using `cancel()`). `Deferred<T>`: A subclass of `Job` that represents a future result of an asynchronous computation, initiated by `async`. It promises a result of type `T` sometime in the future. You can get the result (suspending if necessary) by calling `await()`. It can also be cancelled. In summary: `launch` returns a `Job`. `async` returns a `Deferred<T>`.",
            category = QuizCategory.Coroutines
        ),
        QuizQuestion(
            id = 53,
            questionText = "What makes a function a `suspend` function in Kotlin, and what does it mean for a function to be suspendable?",
            answerText = "A function is marked with the `suspend` modifier to indicate that it can perform long-running operations without blocking the thread it's called from. For a function to be suspendable means:\n*   It can pause its execution at a suspension point (e.g., when calling another `suspend` function like `delay()` or an I/O operation) and allow other coroutines or tasks to run on the underlying thread.\n*   It can resume its execution later, potentially on a different thread, when the suspended operation completes.\n*   `suspend` functions can only be called from other `suspend` functions or from within a coroutine (e.g., inside a `launch` or `async` block).",
            category = QuizCategory.Coroutines
        )
    )
}