package com.example.androidquiz.data.db

import com.example.androidquiz.data.QuizCategory
import com.example.androidquiz.data.QuizQuestion

val defaultQuestions = listOf(
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
    ),
    QuizQuestion(
        id = 54,
        questionText = "What are the key differences between a StateFlow and a SharedFlow in Kotlin Coroutines, and in which scenarios would you choose one over the other?",
        answerText = "Both StateFlow and SharedFlow are hot flows that allow sharing data streams with multiple collectors, but they are designed for different use cases.\n\n**StateFlow:\n*   State Holding: It is a state-holder. It always has an initial value and only stores and emits the most recent value to new collectors. Its value property allows synchronous access to the current state.\n*   Conflation: StateFlow is conflated, meaning if new values are emitted before a collector can process the current one, the intermediate values are dropped, and the collector only receives the latest value.\n*   Value Emission: It only emits a new value if it is distinct from the previous one.\n*   Use Case: Ideal for representing observable state that should always have a value, such as UI state in an Android ViewModel. New collectors immediately get the current state, which is useful for configuration changes.\n\nSharedFlow**:\n*   Event Broadcasting: It is designed to broadcast events to all collectors without holding a state. It does not require an initial value.\n*   Configurable Replay Cache: You can configure its replay cache to specify how many previously emitted values should be sent to new subscribers. By default, its replay cache is zero.\n*   Value Emission: It emits all values, even if they are duplicates of the previous one.\n*   Use Case: Ideal for one-time events that should be consumed by all listeners, such as showing a Snackbar message, navigation events, or analytics events. Since it doesn't have an initial value, it prevents re-triggering events on configuration changes (like an orientation change in Android).",
        category = QuizCategory.Coroutines
    ),
    QuizQuestion(
        id = 55,
        questionText = "What are the best practices for sending data securely over the network in an Android application?",
        answerText = "Securing data in transit is crucial for protecting user privacy and preventing attacks. Key best practices include:\n\n1.  **Use HTTPS Everywhere:** Always use HTTPS (HTTP over TLS) instead of HTTP for all network communications. [2, 15] HTTPS encrypts the data exchanged between the app and the server, ensuring confidentiality and integrity. [2]\n\n2.  **Use Network Security Configuration (NSC):** This is a declarative XML file where you can define network security policies for your app without changing app code. [5] Key features include:\n    *   **Disabling Cleartext Traffic:** You can prevent the app from accidentally using unencrypted (HTTP) traffic, which is the default for apps targeting Android 9 (API level 28) and higher. [4, 5]\n    *   **Certificate Pinning:** You can restrict your app's secure connections to particular certificates or public keys. [5, 7] This helps prevent man-in-the-middle (MITM) attacks where an attacker might use a fraudulent certificate. [14] While powerful, it should be implemented carefully with backup pins and short expiration times to avoid connectivity issues if the server's certificate changes. [11]\n    *   **Custom Trust Anchors:** Define a custom set of trusted Certificate Authorities (CAs), for example, for a self-signed or internal company certificate. [3, 5]\n\n3.  **Encrypt Sensitive Data Before Transmission:** For highly sensitive data, consider encrypting it on the client-side before sending it over HTTPS. [6] This provides an additional layer of protection. Use strong, modern encryption algorithms like AES-256. [9]\n\n4.  **Protect API Keys and Secrets:** Never hardcode API keys, tokens, or other secrets in your source code. [10] Use secure storage mechanisms like the Android Keystore to store them, or retrieve them from a secure server at runtime.\n\n5.  **Use Modern TLS Protocols:** Ensure your server and client support modern and secure versions of the TLS protocol (e.g., TLS 1.2 or 1.3) and strong cipher suites. [6]",
        category = QuizCategory.Security
    ),
    QuizQuestion(
        id = 56,
        questionText = "What are the modern best practices for securely storing sensitive customer information (data-at-rest) in an Android application, and what is the role of the Android Keystore?",
        answerText = "Securing data-at-rest is critical to protect user information if a device is lost, stolen, or compromised. The best practice is a defense-in-depth approach that combines encrypted storage with secure key management.\n\n1.  **Avoid Storing Secrets Whenever Possible:** The most secure method is to not store sensitive data on the device at all. [17] Process it on a secure backend when feasible. [17]\n\n2.  **Use the Android Keystore System:** The Android Keystore is not a direct data storage solution, but a secure container for cryptographic keys. [4] Its primary role is to store encryption keys in a way that makes them difficult to extract from the device. [2] On modern devices, keys are protected within secure hardware (like a Trusted Execution Environment - TEE), meaning the key material itself is never exposed to the application or the OS. [3, 17] The Keystore performs cryptographic operations like encryption and decryption internally. [3, 4]\n\n3.  **Encrypt Data Using Keystore-Managed Keys:** The recommended approach is to generate a cryptographic key inside the Android Keystore and use it to encrypt sensitive data. [10, 17] The encrypted data can then be stored in a standard storage location like a file or database. [4]\n\n4.  **Leverage the Jetpack Security (Crypto) Library:** This library simplifies the process of securing data. It provides high-level, easy-to-use implementations for encrypted storage:\n    *   **EncryptedSharedPreferences:** A wrapper around `SharedPreferences` that automatically encrypts both keys and values. [5, 11] It uses a master key, which is managed by the Android Keystore, to perform encryption. [5, 10] This is ideal for storing small, sensitive key-value pairs like authentication tokens. [5, 11]\n    *   **EncryptedFile:** For securely storing larger data, like JSON files or images, `EncryptedFile` from the same library can be used. [11] It encrypts the file's contents, again using a key managed by the Keystore. [11]\n\n**In summary:** The best practice is to encrypt sensitive data. Use the Jetpack Security library's `EncryptedSharedPreferences` or `EncryptedFile`, which seamlessly integrates with the Android Keystore to manage encryption keys securely, providing robust protection for data-at-rest. [10, 11]",
        category = QuizCategory.Security
    ),
    QuizQuestion(
        id = 57,
        questionText = "What are Intent-based security vulnerabilities in Android, and what are the best practices to mitigate them?",
        answerText = "Intent-based vulnerabilities occur when an app insecurely uses Intents for communication, creating risks like data leakage, unauthorized actions, and component access. [17, 7] Key types include:\n\n1.  **Intent Interception/Hijacking:** Occurs when an app sends an implicit Intent (specifying an action but not a target component) containing sensitive data. [5, 17] A malicious app can register an Intent Filter for the same action to intercept this data. [5, 17]\n2.  **Intent Spoofing:** A malicious app sends a crafted Intent directly to one of your app's exported components to trigger an unintended action. [7]\n3.  **Intent Redirection:** An attacker tricks a privileged, exported component (like an Activity) into forwarding a malicious, embedded Intent to a private, non-exported component. [14] This allows the attacker to access components that are supposed to be internal to your app. [14, 7]\n\n**Best Practices for Mitigation:**\n\n*   **Prefer Explicit Intents:** For all internal app communication, always use explicit Intents, which specify the exact component (e.g., `MyActivity.class`) to handle the Intent. This prevents any other app from intercepting it. [7]\n*   **Minimize Exported Components:** In your `AndroidManifest.xml`, set `android:exported=\"false\"` for all components (Activities, Services, Broadcast Receivers) that do not need to be accessible to other apps. This is the most effective way to prevent spoofing and redirection. [7]\n*   **Validate All Incoming Intent Data:** Never trust data received from an external Intent, even from an App Link/Deep Link. [7, 1] Always validate and sanitize any parameters, URIs, or extras before using them to prevent issues like path traversal or injection attacks. [2, 1]\n*   **Use `setPackage()` for Implicit Intents:** If you must use an implicit Intent to interact with another app, specify the target app's package name using `intent.setPackage(\"com.example.targetapp\")` to ensure only that app can receive it. [5]\n*   **Secure Deep Links:** For deep links, use App Links with `android:autoVerify=\"true\"`. This verifies that your app is the official handler for your domain, preventing malicious apps from intercepting these links. [1]\n*   **Apply Custom Permissions:** For exported components that handle sensitive information, protect them by defining and requiring a custom permission.",
        category = QuizCategory.Security
    ),
    QuizQuestion(
        id = 58,
        questionText = "Describe the 'Testing Pyramid' in the context of Android development, and explain the difference between a Unit Test and an Instrumented Test.",
        answerText = "The Testing Pyramid is a strategy for organizing automated tests to ensure a scalable and maintainable test suite. [8, 14] It suggests that a project should have a large base of small, fast tests and progressively fewer, larger, and slower tests at the top. [18] For Android, it's typically broken down into three main layers:\n\n1.  **Unit Tests (70%):** These form the base of the pyramid. [17] They are small, focused tests that verify individual units of code (like a single function or class) in isolation. [5, 8] They run on a local JVM without needing an Android device or emulator, which makes them extremely fast. [5, 14] Dependencies are often replaced with 'test doubles' (like mocks or fakes) to isolate the code under test. [1]\n\n2.  **Integration Tests (20%):** This middle layer tests how multiple components work together. [12, 17] This could involve testing the interaction between a ViewModel and a Repository, or a Repository and a database. These tests can be either local unit tests or instrumented tests, depending on whether they need Android framework components.\n\n3.  **UI/End-to-End Tests (10%):** At the top of the pyramid are large tests that validate complete user flows. [17, 18] These tests interact with the UI, simulate user actions, and confirm that the entire system behaves correctly. [18] Because they run the full app on a device or emulator, they are the slowest and most expensive to write and maintain. [18]\n\n**Unit Tests vs. Instrumented Tests:**\n\n*   **Unit Tests (`/test` directory):** These are local tests that run on your development machine's JVM. [14] They are used to test logic that does not depend on the Android framework, such as in ViewModels, Repositories, or utility classes. [2] Their speed allows them to be run frequently.\n\n*   **Instrumented Tests (`/androidTest` directory):** These tests run on a real Android device or an emulator. [7, 21] They have access to the full Android framework APIs, allowing you to test code that relies on a `Context` or to automate UI interactions with libraries like Espresso or the Compose Test framework. [2, 21] UI tests and some integration tests fall into this category. [12, 24]",
        category = QuizCategory.Testing
    ),
    QuizQuestion(
        id = 59,
        questionText = "What are test doubles, and why are they essential in unit testing? Describe the differences between a Mock and a Fake.",
        answerText = "Test doubles are objects that replace real production objects (dependencies) in a test environment. They are essential for isolating the unit of code being tested, allowing for focused, fast, and deterministic tests without relying on external factors like network, databases, or complex framework components.\n\nThere are several types of test doubles, with Mocks and Fakes being two common ones:\n\n*   **Mock:** A mock is a test double that focuses on **behavior verification**. It is pre-programmed with expectations about which of its methods will be called, with what arguments, and in what order. After the test runs, the mock is verified to ensure those expected interactions occurred. Mocks are useful when you need to confirm that your code under test correctly communicates with its dependencies (e.g., \"Did the presenter call `view.showError()` when the data fetch failed?\").\n\n*   **Fake:** A fake is a test double that provides a lightweight, working implementation of the dependency. It doesn't have pre-programmed expectations like a mock, but it simulates the real object's behavior in a simplified way. A common example is an in-memory database that replaces a real database, or a fake repository that returns hardcoded data instead of making a network call. Fakes are useful for **state verification**, where you care about the outcome or state change after an action (e.g., \"Does the ViewModel's state correctly reflect the user data returned by the fake repository?\").\n\nIn short: Use **Mocks** to verify interactions. Use **Fakes** to provide functional, but simplified, dependencies for state testing.",
        category = QuizCategory.Testing
    ),
    QuizQuestion(
        id = 60,
        questionText = "What is a WebView-related security vulnerability in Android, and what are the best practices to mitigate risks when using WebViews?",
        answerText = "WebViews are powerful but can introduce significant security risks if not configured properly, primarily because they can execute JavaScript and interact with native Android code.\n\nOne major vulnerability is **JavaScript Interface Injection**. If you add a JavaScript interface (`addJavascriptInterface`) to a WebView, malicious JavaScript from a compromised or untrusted website could potentially call public methods of that Java/Kotlin object, leading to the execution of unintended native code. [1]\n\n**Best Practices for Mitigation:**\n\n1.  **Disable JavaScript If Not Needed:** The safest approach is to not enable JavaScript if the WebView is only used to display simple web content without interactivity. Disable it via `WebSettings.setJavaScriptEnabled(false)`. [1]\n\n2.  **Limit Content Loading:** Only load content from trusted, whitelisted domains. Avoid loading arbitrary URLs from Intents or other uncontrolled sources. You can override `shouldOverrideUrlLoading` in your `WebViewClient` to control which URLs are loaded. [3]\n\n3.  **Secure JavaScript Interfaces:** If you must use a JavaScript interface:\n    *   **Use `@JavascriptInterface`:** For apps targeting Android 4.2 (API 17) and higher, only methods explicitly annotated with `@JavascriptInterface` are exposed to JavaScript. [1] Always use this annotation and expose as few methods as possible. [1]\n    *   **Run on a Background Thread:** Ensure that any native code called from JavaScript does not block the UI thread.\n\n4.  **Disable File System Access:** Prevent the WebView from accessing the local file system unless absolutely necessary by using `WebSettings.setAllowFileAccess(false)`. [2]\n\n5.  **Use `WebViewAssetLoader` for Local Assets:** For loading local HTML, JS, or CSS files from your app's assets or resources directory, use `androidx.webkit.WebViewAssetLoader`. [4] This modern approach securely serves local files via a virtual domain, preventing same-origin policy violations and file system access issues. [4]",
        category = QuizCategory.Security
    ),
    QuizQuestion(
        id = 61,
        questionText = "What were the key differences between the legacy Dalvik runtime and the modern Android Runtime (ART), particularly regarding their compilation strategies?",
        answerText = "Dalvik and ART are the two runtimes Android has used, and the primary difference lies in their compilation strategies, which has significant impacts on performance and resource usage. [5]\n\n**Dalvik (Legacy Runtime, up to Android 4.4):**\n*   **Compilation Strategy:** Used a **Just-In-Time (JIT)** compiler. [2, 13] This means that each time you ran an app, Dalvik would dynamically translate a portion of the app's bytecode into native machine code on the fly. [15, 13]\n*   **Performance:** App startup was generally faster, but overall performance could be less consistent because compilation was happening during execution. This consumed CPU cycles and battery power every time the app was used. [7, 15]\n*   **Installation & Storage:** App installation was quick and took up less space initially, as the code was not pre-compiled. [7, 13]\n\n**ART (Android Runtime, Android 5.0 and later):**\n*   **Initial Strategy (AOT):** ART was introduced with an **Ahead-Of-Time (AOT)** compilation strategy. [2, 7] This meant that the entire application was compiled into native machine code *at the time of installation*. [15]\n*   **Modern Strategy (Hybrid AOT + JIT):** Starting with Android 7.0, ART evolved into a hybrid runtime. [1] It now uses a combination of AOT, JIT, and interpretation. [12] It uses **profile-guided compilation**, where it JIT-compiles frequently used code paths (\"hot\" code) as the app runs. [4] Then, when the device is idle and charging, ART AOT-compiles these hot parts for optimal performance on subsequent launches. [1, 12]\n\n**Key Benefits of ART over Dalvik:**\n*   **Faster App Execution:** Since code is pre-compiled (either fully AOT or via profile-guided AOT), apps generally run faster and smoother, without the runtime overhead of JIT compilation for frequently used code. [1, 7]\n*   **Improved Battery Life:** By compiling code once during installation or idle periods, ART reduces the CPU load during regular app usage, leading to better battery performance. [3, 7]\n*   **Optimized Garbage Collection:** ART features a more advanced and efficient garbage collector, resulting in fewer and shorter pauses during app execution. [3, 6]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 62,
        questionText = "What is a `StateFlow` in Kotlin Coroutines, and what is its primary use case in Android development?",
        answerText = "A `StateFlow` is a state-holder observable flow that is part of the Kotlin Coroutines library. [3] Its core purpose is to hold and manage a single, observable piece of state. [3, 5, 6]\n\n**Key Characteristics:**\n\n*   **State-Holder:** It always has a value. [3] New collectors immediately receive the most recent value. [5]\n*   **Hot Flow:** A `StateFlow` is a \"hot\" flow, meaning it remains active in memory and holds its value even when there are no collectors. [3, 5, 13]\n*   **Distinct Emissions:** It will only emit a new value if that value is different from the current one. [10] Consecutive repeated values are automatically ignored. [10]\n*   **Mutable and Immutable:** It comes in two variants: `StateFlow` (read-only) and `MutableStateFlow` (read-write), allowing you to control which parts of your code can update the state. [3]\n\n**Primary Use Case in Android:**\n\n`StateFlow` is exceptionally well-suited for managing UI state within an Android `ViewModel`. [1, 2, 5] The `ViewModel` can expose an immutable `StateFlow` containing the complete UI state (e.g., loading status, data, error messages). [3, 5]\n\nThe UI layer (like a Composable function or a View-based UI) collects this flow. [14] Because `StateFlow` holds the last state, the UI automatically receives the most recent state upon collection, which is perfect for handling configuration changes like screen rotations. [4, 13]",
        category = QuizCategory.Coroutines
    ),
    QuizQuestion(
        id = 63,
        questionText = "What is `viewModelScope` and what problem does it solve in Android development?",
        answerText = "The `viewModelScope` is a built-in `CoroutineScope` provided by the `androidx.lifecycle:lifecycle-viewmodel-ktx` library for each `ViewModel` in an app. [1, 4] Its primary purpose is to manage the lifecycle of coroutines launched for business logic within a `ViewModel`. [4]\n\n**Problem Solved:**\n\nBefore `viewModelScope`, developers had to manually manage the lifecycle of asynchronous operations. [9] If a `ViewModel` started an operation (like a network request) and the user navigated away, the `ViewModel` would be destroyed. However, the asynchronous operation would continue running, wasting device resources and potentially leading to memory leaks or crashes if it tried to update a non-existent UI. [3, 8] Developers had to write boilerplate code to cancel these jobs in the `ViewModel`'s `onCleared()` method. [9]\n\n**How `viewModelScope` Solves It:**\n\n`viewModelScope` provides a structured concurrency solution by automatically linking coroutines to the `ViewModel`'s lifecycle. [3, 5] Any coroutine launched within `viewModelScope` is automatically canceled when the `ViewModel` is cleared (i.e., when its `onCleared()` method is called). [1, 2] This completely eliminates the need for manual cancellation and prevents resource leaks, making the code cleaner and safer. [3, 11]\n\n**In summary:** `viewModelScope` simplifies asynchronous programming in `ViewModels` by providing a scope that automatically handles the cancellation of coroutines when they are no longer needed, ensuring that long-running operations don't outlive the `ViewModel`. [1, 11]",
        category = QuizCategory.Coroutines
    ),
    QuizQuestion(
        id = 64,
        questionText = "What is the difference between `compileSdk` and `targetSdk` in an Android project, and how do they affect an application?",
        answerText = "While often set to the same value, `compileSdk` and `targetSdk` serve distinct and critical roles in Android development. [6]\n\n**`compileSdk` (Compile SDK Version):**\n*   **What it is:** This property tells Gradle which version of the Android SDK to use when compiling your application. [2, 6] It defines the set of APIs that your code can access during development. [1, 5]\n*   **Effect:** Setting `compileSdk` to a new version (e.g., 34) allows you to use APIs introduced in that version. [5] If you try to use a new API without updating the `compileSdk`, you will get a compilation error. [1, 5] Changing `compileSdk` by itself does not change the runtime behavior of your app. [1, 6]\n*   **Analogy:** Think of it as the version of the \"toolbox\" or \"library\" you are coding against. [2]\n\n**`targetSdk` (Target SDK Version):**\n*   **What it is:** This property is a signal to the Android operating system about which API level your app was designed and tested for. [1, 6] It's your promise that the app behaves correctly on that Android version. [2]\n*   **Effect:** The Android OS uses this value to enable or disable forward-compatibility behaviors. [1] When you update the `targetSdk`, your app opts into all the new runtime behaviors, security restrictions, and performance optimizations of that API level. For example, if your app targets a lower API level than the device's OS, the system might apply backward-compatibility behaviors to ensure your app doesn't break. [6]\n*   **Analogy:** Think of it as the \"compatibility promise\" you make to the Android OS. [2]\n\n**In Summary:**\n*   `compileSdk` is a build-time instruction that gives you access to new APIs. [9]\n*   `targetSdk` is a runtime instruction that tells the OS how to run your app, enabling modern platform features and restrictions. [9]\n\nBest practice is to keep `compileSdk` and `targetSdk` at the latest stable API level after thoroughly testing your app to ensure it handles all the new runtime changes correctly. [2, 1]",
        category = QuizCategory.BuildAndTools
    ),
    QuizQuestion(
        id = 63,
        questionText = "What is Android?",
        answerText = "Android is an open-source mobile operating system based on a modified version of the Linux kernel. [1, 2] It was initially developed by Android Inc., which was acquired by Google in 2005. [4] Today, it is primarily developed by Google and the Open Handset Alliance. [1, 8]\n\nAndroid is designed primarily for touchscreen mobile devices such as smartphones and tablets. [2, 4] Its user interface is based on direct manipulation, using touch gestures like swiping, tapping, and pinching. [2] Beyond phones and tablets, the Android platform has been adapted for other devices, including televisions (Android TV), cars (Android Auto), and wearable devices (Wear OS). [4]\n\n**Key Characteristics:**\n\n*   **Open Source:** The core of Android, known as the Android Open Source Project (AOSP), is open-source, allowing manufacturers to customize it for their hardware. [2, 8]\n*   **Large App Ecosystem:** Applications are primarily distributed through the Google Play Store, which hosts millions of apps. [11]\n*   **Hardware Diversity:** Unlike its main competitor, iOS, Android runs on a wide variety of devices from many different manufacturers. [5]\n*   **Linux Kernel:** At its foundation, Android uses the Linux kernel to manage core system services such as security, memory management, process management, and hardware drivers. [10]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 65,
        questionText = "What is the role of the Linux Kernel in the Android Architecture, and what are some of its key responsibilities?",
        answerText = "The Linux Kernel is the foundation of the Android platform, acting as a core bridge between the device hardware and the software. [13, 16] Its primary role is to manage the system's core functionalities. [9, 16]\n\n**Key Responsibilities:**\n\n*   **Hardware Abstraction:** The kernel contains device drivers that allow the Android software to communicate with and control the underlying hardware, such as the camera, display, Bluetooth, and Wi-Fi. [14, 18]\n*   **Process Management:** It is responsible for creating, scheduling, and managing all active application processes, ensuring that system resources like the CPU are shared efficiently. [9, 16]\n*   **Memory Management:** The kernel handles the allocation and de-allocation of memory for all processes, which is crucial on resource-constrained mobile devices. [9, 14, 18]\n*   **Security:** It enforces a permission model by running each application in a sandbox with a unique User ID (UID), which isolates app processes from each other and from the system. [14, 16]\n*   **Networking:** It manages the network stack, handling all TCP/IP networking and communication. [14]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 66,
        questionText = "What is the purpose of the Hardware Abstraction Layer (HAL) in the Android platform architecture?",
        answerText = "The Hardware Abstraction Layer (HAL) serves as a bridge between the higher-level Java API framework and the lower-level Linux kernel device drivers. [5, 6] Its main purpose is to provide a standardized interface that allows the Android system to communicate with hardware-specific drivers without needing to know the details of the lower-level implementation. [4, 5, 7]\n\nBefore the HAL, the Android framework had to be adapted for every new hardware variation. The HAL allows Android to be hardware-agnostic. [5, 7] Hardware manufacturers implement these standard interfaces (e.g., for the camera or Bluetooth) for their specific hardware. [4] This modular approach, greatly enhanced by Project Treble in Android 8.0, allows the core Android OS to be updated without requiring changes to the hardware-specific vendor code. [5]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 67,
        questionText = "What are the two key components of the Android Runtime (ART) layer, and what is its main function?",
        answerText = "The Android Runtime (ART) layer is the environment where Android applications execute. Its main function is to run app bytecode. [14, 20] The two key components of this layer are:\n\n1.  **Android Runtime (ART):** This is the modern runtime that replaced the legacy Dalvik Virtual Machine (DVM). [1, 14] ART uses Ahead-Of-Time (AOT) and Just-In-Time (JIT) compilation to translate an app's bytecode into native machine instructions, which significantly improves app performance and battery life. [14]\n2.  **Core Libraries:** This is a set of Java and Kotlin language libraries that provide the fundamental capabilities for app development. [1] It includes libraries for data structures, file access, networking, and more, forming the basis for the APIs that developers use. [11]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 68,
        questionText = "What is the role of the Native C/C++ Libraries layer in the Android architecture?",
        answerText = "This layer contains a collection of C and C++ libraries used by various components of the Android system. [13] These native libraries provide core functionalities and high-performance capabilities that are not available directly in the core Java/Kotlin libraries. [1, 11]\n\nKey examples include:\n\n*   **Graphics Libraries:** Such as OpenGL ES and Vulkan for rendering 2D and 3D graphics. [14]\n*   **Media Framework:** Libraries like Stagefright that support the playback and recording of various audio and video formats. [14]\n*   **WebKit/Blink:** The rendering engine that powers the `WebView` component for displaying web content inside apps. [14]\n*   **SQLite:** A lightweight relational database engine used for local data storage. [11, 14]\n\nWhile system components use these libraries extensively, app developers can also access them directly using the Android Native Development Kit (NDK) for performance-critical tasks like games or signal processing. [13]",
        category = QuizCategory.BuildAndTools
    ),
    QuizQuestion(
        id = 69,
        questionText = "What is the Application Framework layer and what are some of its key components or managers?",
        answerText = "The Application Framework layer provides the high-level building blocks that app developers use to create Android applications. [1, 11] It is a rich set of APIs, primarily written in Java and Kotlin, that expose the system's capabilities in an accessible way. [3, 10]\n\nDevelopers interact with this layer to build UIs and access device features without needing to interface directly with lower-level components. [1] Key services and managers in this layer include:\n\n*   **Activity Manager:** Manages the lifecycle of app components, particularly Activities, and maintains the navigation back stack. [1, 10]\n*   **View System:** Provides a rich set of views (e.g., buttons, lists, text boxes) used to construct an app's user interface. [10]\n*   **Notification Manager:** Allows apps to display custom alerts and messages in the system status bar. [1, 10]\n*   **Resource Manager:** Provides access to non-code assets such as layouts, strings, and graphics. [10, 22]\n*   **Content Providers:** Manages data sharing between applications. [8, 11]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 70,
        questionText = "What is the top layer of the Android architecture, and what does it consist of?",
        answerText = "The top layer of the Android software stack is the **Applications** layer. [1, 2] This is the layer that users directly interact with. [11]\n\nIt consists of two main types of applications:\n\n1.  **System Apps:** These are the core applications that are pre-installed on the device. [13, 14] This includes apps for essential functions like the Phone dialer, Contacts, Browser, and SMS messaging. [13]\n2.  **User Apps:** These are any third-party applications that the user installs from the Google Play Store or other sources. [14, 21]\n\nAn important principle of the Android architecture is that there is no special distinction between system apps and user-installed apps. A third-party app can, for example, become the user's default web browser or messaging client. [13]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 71,
        questionText = "What is an explicit intent and what is its primary use case in Android?",
        answerText = "An explicit intent is a message used to launch a specific, known application component, such as a particular `Activity` or `Service`. [1, 2, 6] It works by explicitly defining the target component's class name in the intent object. [1, 6]\n\nThe primary use case for explicit intents is for navigation and communication *within your own application*. [2, 6, 9] Because you know the class names of the activities and services in your app, you can use an explicit intent to reliably start them. [1, 6] For example, when a user clicks a button to go from a list screen to a detail screen, you would use an explicit intent to start the specific `DetailActivity` class. [3]\n\nThis direct targeting makes explicit intents predictable and secure for internal app communication, as there is no ambiguity about which component will handle the intent. [6]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 72,
        questionText = "What is an implicit intent and when would you use one?",
        answerText = "An implicit intent is used when you want to request an action but do not know the specific app or component that should handle it. [1, 14] Instead of naming a target component, you declare a general action to perform (like `ACTION_VIEW` or `ACTION_SEND`) and often provide data for that action (like a URL or an image). [3, 13]\n\nThe Android system then performs a process called \"intent resolution,\" where it searches all installed apps for a component that has registered its ability to handle that specific action and data type. [6, 12] If multiple apps can handle the request, the system presents the user with a chooser dialog to select an app (e.g., when sharing a photo, the user can choose between a messaging app or a social media app). [3, 6, 15]\n\nYou would use an implicit intent to delegate tasks to other apps. Common use cases include:\n*   Opening a web page in a browser. [2]\n*   Sharing content with another app. [2, 3]\n*   Placing a phone call or showing a location on a map. [13, 14]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 73,
        questionText = "What is the role of an Intent Filter in the Android system?",
        answerText = "An Intent Filter is an expression in an app's `AndroidManifest.xml` file that tells the Android system what types of *implicit intents* a specific component (like an Activity, Service, or Broadcast Receiver) is capable of handling. [7, 10]\n\nWhen an app sends an implicit intent, the Android system compares the intent's action, data (URI and MIME type), and category against the intent filters declared by all apps on the device to find a match. [1, 12] If an intent matches a component's filter, the system can deliver the intent to that component. [1, 7]\n\nEssentially, an intent filter is how an app advertises its capabilities to other apps and to the system. [16] For example, by declaring an intent filter for the `ACTION_SEND` action with a MIME type of `image/*`, an app is telling the system it can receive and handle images from other apps. [4, 15]\n\nIf a component does not have any intent filters, it can only be started by an explicit intent. [1, 16]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 74,
        questionText = "What is a `PendingIntent`, and how is it different from a regular `Intent`?",
        answerText = "A `PendingIntent` is a token or a wrapper around a standard `Intent` object that grants another application the permission to execute that intent on your app's behalf at a future time. [1, 2, 7] The key difference is that a regular `Intent` is something your app fires immediately, whereas a `PendingIntent` is given to an external system component—like `NotificationManager` or `AlarmManager`—to be fired later, even if your app's process is no longer running. [3, 11]\n\n**Key Characteristics:**\n\n*   **Delegation:** It allows a foreign app (e.g., the Android system) to perform an action using your app's identity and permissions. [1, 8]\n*   **Lifecycle Independence:** A `PendingIntent` remains valid even after the application that created it is killed. [5, 8, 11]\n\n**Intent vs. PendingIntent:**\n\n*   **`Intent`:** You want to perform an action *now* (e.g., `startActivity(intent)`). [11]\n*   **`PendingIntent`:** You want another component to perform an action *later* on your behalf (e.g., setting an action for a notification tap or a scheduled alarm). [6, 7]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 75,
        questionText = "What are the common use cases for a `PendingIntent` in Android?",
        answerText = "A `PendingIntent` is used whenever you need to delegate an action to be performed in the future by another application or the Android system itself. [2, 3]\n\nCommon use cases include:\n\n1.  **Notifications:** This is the most frequent use case. When a user taps on a notification, the `NotificationManager` (which is part of the Android system) fires the `PendingIntent` to launch an `Activity` in your app. [1, 6, 16]\n2.  **AlarmManager:** To schedule tasks to run at a specific time or interval, you provide the `AlarmManager` with a `PendingIntent` that it will execute when the alarm triggers, often to start a `Service` or `BroadcastReceiver`. [3, 5, 6]\n3.  **App Widgets:** When a user interacts with a widget on the home screen, the Home screen app fires a `PendingIntent` to perform an action, such as starting an `Activity` or updating the widget's content. [6, 16]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 76,
        questionText = "What is the purpose of the `FLAG_IMMUTABLE` and `FLAG_MUTABLE` flags for a `PendingIntent`?",
        answerText = "Starting with Android 12 (API 31), it is mandatory to specify the mutability of a `PendingIntent` using either `FLAG_IMMUTABLE` or `FLAG_MUTABLE`. [1, 17]\n\n*   **`FLAG_IMMUTABLE`**: This flag indicates that the underlying `Intent` within the `PendingIntent` cannot be modified by the app that receives it. [1, 4] This is the recommended default for security reasons, as it prevents malicious apps from hijacking the `PendingIntent` and altering its behavior, for example, by adding unexpected extras. [4, 9, 14] An immutable `PendingIntent` can still be updated by its original creator app using the `FLAG_UPDATE_CURRENT` flag. [1, 18]\n\n*   **`FLAG_MUTABLE`**: This flag indicates that the intent's extras can be modified by the component that invokes the `PendingIntent`. [1, 4] This is necessary only in specific scenarios where the system needs to add data to the intent, such as for direct reply actions in notifications or for certain geofencing and bubble functionalities. [15, 17] Using `FLAG_MUTABLE` should be done with caution, as it can open security vulnerabilities if not handled correctly. [4, 6]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 77,
        questionText = "What is the role of the `Context` class in Android, and what can it be used for?",
        answerText = "In Android, the `Context` class serves as a vital bridge between an application and the Android operating system. [5] It provides access to the application's environment and allows access to application-specific resources and system-level services. [2, 7]\n\nEssentially, a `Context` represents the current state of your application. [1, 4] It is required for a wide range of common operations, including:\n\n*   **Accessing Resources:** Loading assets, strings, colors, drawables, and themes. [2, 7]\n*   **Launching Components:** Starting new activities, services, and broadcasting intents. [2]\n*   **UI Operations:** Inflating layouts and showing UI elements like Toasts and Dialogs. [8]\n*   **Accessing System Services:** Getting a handle to system-level services such as `NotificationManager`, `AlarmManager`, or `LocationManager`. [8]\n*   **Filesystem and Databases:** Gaining access to private application directories and databases, including `SharedPreferences`. [4]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 78,
        questionText = "What is the difference between an Application Context and an Activity Context?",
        answerText = "The main difference between an Application Context and an Activity Context is their lifecycle and scope. [8]\n\n**Application Context (`getApplicationContext()`):**\n*   **Lifecycle:** It is a singleton instance tied to the lifecycle of the entire application itself. [3, 8] It lives as long as your application process is running. [8]\n*   **Scope:** It is global and not tied to any specific UI screen. [3, 4]\n*   **Use Cases:** It should be used for operations that need a context that outlives any single activity, such as initializing singletons, running background services, or accessing shared preferences. [3, 8]\n\n**Activity Context (e.g., `this` within an Activity):**\n*   **Lifecycle:** It is tied directly to the lifecycle of a specific `Activity`. [8, 13] It is created when the Activity is created and destroyed when the Activity is destroyed. [8]\n*   **Scope:** It is specific to a single screen. [13]\n*   **Use Cases:** It should be used for most UI-related tasks, such as inflating views, creating dialogs, or starting a new activity, as it carries theme and other window-specific information. [4, 8, 12]\n\nUsing the wrong context can lead to memory leaks or app crashes. [8] The general rule is to use the narrowest-scoped context available, which is usually the Activity context. [12]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 79,
        questionText = "What is a Context-related memory leak, and what is the most common cause?",
        answerText = "A Context-related memory leak occurs when a long-lived object holds a reference to a short-lived `Context`, preventing it from being garbage collected after it has been destroyed. [12, 15] This is a significant issue in Android because `Context` objects, especially `Activity` contexts, can be very large and hold references to entire view hierarchies and all their resources. [9]\n\nThe most common cause of this leak is **storing an `Activity` context in a static variable or a long-lived object like a singleton or a ViewModel**. [15]\n\nHere's the scenario:\n1.  A singleton or static field needs a `Context` and is given a reference to a running `Activity`.\n2.  The user rotates the screen or navigates away, causing the original `Activity` instance to be destroyed.\n3.  However, the garbage collector cannot reclaim the memory from the destroyed `Activity` because the singleton, which has a global application scope, still holds a strong reference to it. [15]\n\nTo prevent this, you should avoid passing `Activity` contexts to objects that will outlive the `Activity`. Instead, pass the **Application Context**, which is safe to hold because it lives as long as the application itself. [10, 15]",
        category = QuizCategory.AndroidFundamentals
    ),

    QuizQuestion(
        id = 80,
        questionText = "What is a `ContextWrapper` and what is its primary purpose?",
        answerText = "A `ContextWrapper` is a class that acts as a proxy, wrapping around another `Context` instance (referred to as the `baseContext`). [5, 9] It delegates all of its calls to this base `Context`. [1, 5]\n\nThe primary purpose of a `ContextWrapper` is to allow for the modification of a `Context`'s behavior without changing the original `Context` object. [2, 6] By creating a subclass of `ContextWrapper`, developers can override specific methods to create a customized version of a `Context`. A well-known example of this is the `ContextThemeWrapper`, which is what `Activity` extends. It wraps a base context and overrides methods like `getTheme()` and `getSystemService()` to apply a specific theme to the resources and views it creates. [1, 3, 6]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 81,
        questionText = "What is the relationship between `ContextWrapper` and `getBaseContext()`?",
        answerText = "`ContextWrapper` is a proxy class that contains and delegates calls to another `Context` instance. The `getBaseContext()` method is the function used to access this original, wrapped `Context` from within the wrapper. [6, 9, 11]\n\nIn essence:\n*   A `ContextWrapper` is created by passing a `Context` instance to its constructor. [1, 9]\n*   This original `Context` is stored internally as the \"base context.\"\n*   `getBaseContext()` simply returns this original `Context` object that the wrapper is managing. [6, 9]\n\nThis mechanism is fundamental to how Android components like `Activity` and `Service` work, as they are themselves subclasses of `ContextWrapper`. [3, 4] It allows them to extend a base `Context` provided by the Android system while adding their own specific functionalities. [4, 6]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 82,
        questionText = "What is an Android `Looper` and what is its primary role?",
        answerText = "A `Looper` is a class in Android used to keep a thread alive, manage a message queue, and process messages (like `Runnable` or `Message` objects) that are sent to it. [1, 3, 12] By default, a standard thread in Java terminates after it finishes executing its `run()` method. [4, 12]\n\nThe primary role of a `Looper` is to turn a standard thread into a worker thread that can process multiple tasks sequentially over its lifetime. [8, 13] It does this by creating a message loop that continuously checks a `MessageQueue` for new tasks. [1, 8] If a task is present, the `Looper` dispatches it to the appropriate `Handler` for execution; if the queue is empty, the `Looper` waits. [2, 6]\n\nTo use a `Looper`, you must call `Looper.prepare()` within the thread to initialize the `Looper` and its `MessageQueue`, and then call `Looper.loop()` to start the message processing loop. [1, 6] The Android main (UI) thread is a prominent example of a thread that already has a `Looper` running, which is why it can process UI events and other tasks without terminating. [5, 6]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 83,
        questionText = "What is an Android `Handler` and what are its two main use cases?",
        answerText = "A `Handler` is a class that allows you to send and process `Message` and `Runnable` objects associated with a thread's `MessageQueue`. [1, 3, 8] Each `Handler` instance is bound to the thread that created it and the `MessageQueue` of that thread's `Looper`. [1, 2, 7]\n\nIts two main use cases are:\n\n1.  **Communicating between threads:** This is the most common use. A `Handler` provides a safe way for a background thread to pass a task to the main (UI) thread for execution. [2, 3, 8] Since the Android UI toolkit is not thread-safe, all UI updates must happen on the main thread, and a `Handler` is a primary mechanism to achieve this. [8, 15]\n2.  **Scheduling future tasks:** A `Handler` can schedule `Runnable` or `Message` objects to be executed at a future time. [1, 3, 13] This is done using methods like `postDelayed()` and `sendMessageDelayed()`, which add the task to the `MessageQueue` to be processed by the `Looper` after the specified delay has passed. [1, 3, 12]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 84,
        questionText = "What is an Android `HandlerThread` and how does it differ from a standard `Thread` with a `Looper`?",
        answerText = "A `HandlerThread` is a subclass of `Thread` that comes pre-configured with a `Looper` and a `MessageQueue`. [3, 6] Its purpose is to simplify the creation of a background thread that can process tasks sequentially from a message queue. [5]\n\nWhile you can manually create a standard `Thread` and set up a `Looper` within its `run()` method by calling `Looper.prepare()` and `Looper.loop()`, a `HandlerThread` handles all of this setup internally. [4, 5] You simply create and start the `HandlerThread`, and it automatically prepares a `Looper` for you. [3, 4]\n\n**Key Differences & Advantages of `HandlerThread`:**\n\n*   **Simplicity:** It removes the boilerplate code required to set up a `Looper` and its message queue. [6]\n*   **Sequential Execution:** It is ideal for scenarios where you need to run long-running background tasks one after another, in the order they are submitted, without blocking the UI thread. [5]\n*   **Dedicated Worker Thread:** Once started, you can get its `Looper` (via `getLooper()`) and create one or more `Handler` instances to post `Runnable` or `Message` objects to its queue from any thread, including the main thread. [2, 3]\n*   **Cleanup:** It provides a `quit()` or `quitSafely()` method to properly terminate the looper and the thread when it's no longer needed. [2, 9]",
        category = QuizCategory.AndroidFundamentals
    ),
    QuizQuestion(
        id = 85,
        questionText = "What are product flavors in Android, and what are their primary use cases?",
        answerText = "In Android, product flavors are a feature of the Gradle build system that allows you to create different versions or variants of your application from a single codebase. They enable you to manage variations of your app that might differ in features, branding, or configuration while sharing the majority of the code and resources.The primary purpose of product flavors is to create customized versions of an app for different scenarios without maintaining separate projects. This is configured in the build.gradle file.Common use cases for product flavors include:•Free vs. Paid Versions: This is a classic example where you can use flavors to create a 'free' version with limited features (and perhaps ads) and a 'paid' or 'premium'' version with full functionality.•Branding and White-Labeling: Creating different versions of an app for multiple clients, each with its own unique branding, such as logos, color schemes, and app icons.•Different Environments: Managing different build configurations for development, testing (QA), and production. For instance, a 'dev' flavor could point to a test server, while the 'prod' flavor points to the live server.•Varying App Features: Enabling or disabling certain functionalities based on the flavor. For example, a 'basic' flavor might have a core set of features, while an 'advanced' flavor includes more complex tools.•Distinct Application IDs: Each flavor can have a unique applicationId, which allows multiple versions of the same app (e.g., 'free' and 'paid') to be published on the Google Play Store and coexist on the same device.•Flavor-Specific Code and Resources: You can have different source code, resources (like strings and layouts), and even dependencies for each flavor. For example, an ad-supported flavor can include a dependency for an ad library, while the paid version does not.By combining product flavors with build types (like debug and release), Gradle generates a complete set of build variants, such as freeDebug, freeRelease, paidDebug, and paidRelease.",
        category = QuizCategory.BuildAndTools
    ),
    QuizQuestion(
        id = 86,questionText = "What are build variants in Android, and how are they formed?",
        answerText = "A build variant is the final, buildable version of an app that Gradle produces by combining the configurations from a build type and one or more product flavors. [1, 2] Each build variant represents a unique version of your app that you can build and distribute. [1]\n\nThey are formed by creating a matrix of all possible combinations of your defined build types and product flavors. [9]\n\n*   **Build Types:** Define the build and packaging settings, like `debug` and `release`. [6, 8] This includes things like signing configurations, debugging enabling, and code shrinking (minification). [9]\n*   **Product Flavors:** Define different versions of the app, such as `free` and `paid`, or `staging` and `production`. [5, 8] These can have different features, resources (like icons and strings), and custom code. [5, 9]\n\nFor example, if you have two build types (`debug`, `release`) and two product flavors (`demo`, `full`), Gradle will generate four build variants: `demoDebug`, `demoRelease`, `fullDebug`, and `fullRelease`. [7] You can then select any of these variants to build and run.",
        category = QuizCategory.BuildAndTools
    ),
    QuizQuestion(
        id = 87,
        questionText = "What is a build type in Android, and what is it used for?",
        answerText = "A build type defines a set of properties that Gradle uses when building and packaging an Android app. [4] It is used to configure different versions of your app for various stages of the development lifecycle. [3, 4]\n\nBy default, Android Studio creates two build types: [1, 2, 8]\n\n1.  **`debug`**: This build type is used for development and testing. [5] It is configured to be debuggable (`debuggable true`), enabling you to use debugging tools, and is automatically signed with a generic debug keystore. [4, 11]\n2.  **`release`**: This is the build type intended for distribution to users. [5] It is not debuggable and is typically configured for performance optimizations, such as code shrinking with ProGuard (`minifyEnabled true`) and resource shrinking. [1, 9] It must be signed with a production key before it can be uploaded to the Play Store. [1, 11]\n\nYou can also create custom build types (e.g., `qa`, `staging`) to define specific configurations for different environments, such as pointing to a different backend server or enabling extra logging. [5, 6]",
        category = QuizCategory.BuildAndTools
    ),
    QuizQuestion(
        id = 88,
        questionText = "What is a DataSource in Android Jetpack, and what is its role in the Paging library?",
        answerText = "A `DataSource` is an abstract base class in the Android Jetpack Paging library that defines how to load chunks (pages) of data from a data source, such as a database or a network API. [1, 3] It serves as the bridge between your data repository and the `PagedList`, which is the container that holds the loaded data. [2, 4]\n\n**Role in the Paging Library:**\n\nThe primary role of a `DataSource` is to enable efficient loading of large datasets in smaller, manageable chunks, improving app performance and user experience. [5] Instead of loading an entire dataset into memory at once, the `DataSource` loads data incrementally as the user scrolls through a list. [3, 6]\n\n**Types of DataSource:**\n\nThe Paging library (version 2.x) provides three main types of `DataSource`:\n\n1.  **`PageKeyedDataSource`**: Used when pages are identified by keys (like \"next\" and \"previous\" tokens), commonly used with REST APIs that return page tokens. [7, 8]\n2.  **`ItemKeyedDataSource`**: Used when each item contains a key that can be used to fetch the next set of items, such as loading comments based on the ID of the last comment. [7, 9]\n3.  **`PositionalDataSource`**: Used when data can be loaded from any position using an offset and limit, typically used with databases that support `LIMIT` and `OFFSET` queries. [7, 10]\n\n**Note:** In Paging 3, `DataSource` was replaced by `PagingSource`, which provides a more flexible and Kotlin-friendly API. [11]",
        category = QuizCategory.JetpackComponents
    ),
    QuizQuestion(
        id = 89,
        questionText = "What is DataStore in Android Jetpack, and how does it differ from SharedPreferences?",
        answerText = "DataStore is a modern data storage solution from Android Jetpack that provides a safe, consistent, and asynchronous way to store small amounts of data, such as user preferences and application settings. [1, 2] It is designed as a replacement for `SharedPreferences`, offering significant improvements in safety, performance, and functionality. [3, 4]\n\n**Key Features of DataStore:**\n\n*   **Asynchronous API:** DataStore uses Kotlin coroutines and Flow to provide fully asynchronous operations, eliminating the risk of blocking the main thread. [2, 5] In contrast, `SharedPreferences` has synchronous methods that can cause UI jank. [6]\n*   **Type Safety:** DataStore offers two implementations: `Preferences DataStore` (key-value pairs similar to SharedPreferences) and `Proto DataStore` (uses Protocol Buffers for typed objects), providing better type safety than SharedPreferences. [1, 7]\n*   **Data Consistency:** DataStore guarantees data consistency and handles data corruption gracefully with exception handling. [3, 8] SharedPreferences can fail silently or throw runtime exceptions on disk I/O errors. [6, 8]\n*   **No synchronous API:** Unlike SharedPreferences, DataStore does not offer a synchronous API, which encourages better architectural practices by forcing developers to use coroutines or RxJava. [4, 9]\n\n**When to Use DataStore:**\nUse DataStore for storing key-value pairs or typed objects with protocol buffers when you need a safe, asynchronous, and modern alternative to SharedPreferences. [10] It is ideal for user settings, feature flags, and other small datasets that need to persist across app sessions. [2, 11]",
        category = QuizCategory.JetpackComponents
    ),
    QuizQuestion(
        id = 90,
        questionText = "What is the Composer in Jetpack Compose, and what is its role?",
        answerText = "The `Composer` is a core internal class in Jetpack Compose that manages the composition process and tracks changes to composable functions. [1, 2] It is the runtime engine that orchestrates how composables are executed, recomposed, and ultimately rendered to the screen. [3]\n\n**Role of the Composer:**\n\nThe primary role of the `Composer` is to:\n\n1.  **Track State Changes:** It monitors state objects and determines which parts of the UI need to be recomposed when state changes occur. [2, 4] This enables Compose's intelligent recomposition, where only the affected composables are re-executed rather than the entire UI tree. [5]\n\n2.  **Manage the Composition:** The `Composer` maintains a slot table that represents the structure of the composable tree. [6] During composition, it records information about each composable function call, including its parameters and children. [6, 7]\n\n3.  **Enable Smart Recomposition:** By tracking which composables read which state, the `Composer` can skip recomposing functions whose inputs haven't changed. [4, 8] This optimization is key to Compose's performance.\n\n4.  **Handle Side Effects:** It manages the lifecycle of effects like `LaunchedEffect`, `DisposableEffect`, and `remember`, ensuring they are properly created, updated, and disposed of. [9]\n\nWhile developers rarely interact with the `Composer` directly, it is implicitly passed to every composable function as a hidden compiler-generated parameter. [10] This allows the Compose runtime to automatically track and manage the composition state without requiring manual intervention from developers. [11]",
        category = QuizCategory.JetpackCompose
    ),
    QuizQuestion(
        id = 91,
        questionText = "What are the three phases of Jetpack Compose, and what happens in each phase?",
        answerText = "Jetpack Compose renders UI through three distinct phases that execute in order for every frame. [1, 2] Understanding these phases is crucial for writing performant composables and avoiding unnecessary work. [3]\n\n**The Three Phases:**\n\n1.  **Composition Phase:** This is where Compose executes composable functions to build or update the UI tree. [2, 4] During this phase, Compose determines *what* should be displayed by calling your composable functions and recording the structure of the UI. [5] When state changes, only the composables that read that specific state are re-executed (recomposed), making this process efficient. [6, 7] The output of this phase is a tree structure that describes the UI hierarchy. [2]\n\n2.  **Layout Phase:** In this phase, Compose measures and positions every element in the UI tree. [2, 4] Each node in the tree measures its children (if any) and decides on its own size and position based on layout constraints passed from its parent. [8, 9] This phase determines *where* each element should be placed on the screen and how big it should be. [5] The layout phase walks the tree twice: first to measure sizes, then to place elements. [10]\n\n3.  **Drawing Phase:** The final phase is where the actual pixels are rendered to the screen. [2, 4] Compose traverses the UI tree and calls the drawing commands for each element, such as drawing backgrounds, borders, text, and images. [5, 11] This is where the visual representation of your UI is painted onto the canvas. [12]\n\n**Key Principle:** These phases execute in strict order (Composition → Layout → Drawing), and changes in one phase can trigger subsequent phases. [13] For example, a state change triggers recomposition, which may then trigger layout and drawing. However, if only layout parameters change (without recomposition), only the layout and drawing phases need to re-execute. [14]",
        category = QuizCategory.JetpackCompose
    ),
    QuizQuestion(
        id = 92,
        questionText = "How does the Compose compiler determine whether a parameter is stable or unstable, and why does this matter for recomposition?",
        answerText = "The Compose compiler analyzes the types of composable function parameters to determine their stability. [1, 2] A type is considered **stable** if the compiler can guarantee that its equality will never change for the same instance, and that all its public properties are also stable. [3, 4]\n\n**Rules for Stability:**\n\nA type is stable if it meets one of the following criteria:\n\n1.  **Primitive Types:** All primitive types (`Int`, `String`, `Boolean`, `Float`, etc.) are inherently stable. [5, 6]\n2.  **Immutable Types:** Types annotated with `@Immutable` or `@Stable` are explicitly marked as stable by the developer. [7, 8]\n3.  **Functions/Lambdas:** Function types are considered stable because their reference identity is what matters, not their implementation. [9]\n4.  **Value Classes:** Kotlin value classes wrapping stable types are considered stable. [10]\n\nA type is **unstable** if:\n\n*   It's a mutable class with `var` properties. [11, 12]\n*   It's an interface or abstract class (the compiler cannot guarantee what implementations will do). [13]\n*   It comes from a module that wasn't compiled with the Compose compiler plugin (like standard collections: `List`, `Set`, `Map`). [14, 15]\n\n**Why This Matters for Recomposition:**\n\nStability is critical for Compose's smart recomposition optimization. [16] When all parameters to a composable function are stable, the Compose runtime can perform **smart equality checks**. [17] If the new values are equal to the previous values (using `equals()`), Compose can **skip recomposition** of that composable entirely, even if its parent recomposes. [18, 19]\n\nIf any parameter is unstable, Compose cannot safely skip recomposition because it cannot reliably determine if the value has changed. [20] This means the composable will recompose every time its parent recomposes, even if the data hasn't actually changed, leading to unnecessary work and potential performance issues. [21, 22]\n\n**Best Practice:** To ensure optimal performance, make your data classes immutable, use `val` instead of `var`, and consider annotating them with `@Immutable` or `@Stable` when appropriate. [23, 24] For collections, use Kotlinx Immutable Collections or wrap them in stable data classes. [25]",
        category = QuizCategory.JetpackCompose
    ),
    QuizQuestion(
        id = 93,
        questionText = "In a composable that triggers a delayed action using LaunchedEffect, how would you make sure that the latest lambda is invoked after the delay?",
        answerText = "To ensure that the latest lambda is invoked after a delay in a `LaunchedEffect`, you should use `rememberUpdatedState` to capture and track the most recent version of the lambda. [1, 2]\n\n**The Problem:**\n\nWhen `LaunchedEffect` is launched with a key that doesn't change (like `Unit` or `true`), the coroutine runs only once and captures the lambda at the time of initial composition. [3, 4] If the lambda or its captured variables change during recomposition, the coroutine will still execute the old version after the delay, which can lead to stale closures and unexpected behavior. [5]\n\n**The Solution:**\n\nUse `rememberUpdatedState` to wrap the lambda or callback. This API creates a mutable reference that always holds the latest value, even across recompositions. [2, 6]\n\n```kotlin\n@Composable\nfun MyComposable(onTimeout: () -> Unit) {\n    val currentOnTimeout by rememberUpdatedState(onTimeout)\n    \n    LaunchedEffect(Unit) {\n        delay(3000L)\n        currentOnTimeout() // Always invokes the latest lambda\n    }\n}\n```\n\n**How It Works:**\n\n*   `rememberUpdatedState(onTimeout)` creates a `State<T>` object that is updated whenever `onTimeout` changes during recomposition. [6, 7]\n*   The `LaunchedEffect` block captures `currentOnTimeout`, which is a reference to this state holder, not the lambda itself. [8]\n*   When the delay completes, `currentOnTimeout()` reads the current value from the state holder, ensuring the most recent lambda is executed. [6, 9]\n\n**When to Use:**\n\nThis pattern is essential when a long-running effect needs to call a callback that might change, such as event handlers, navigation callbacks, or analytics triggers. [10] It's particularly important for effects with keys like `Unit` or stable keys that won't trigger re-launching. [4, 11]",
        category = QuizCategory.JetpackCompose
    ),
)