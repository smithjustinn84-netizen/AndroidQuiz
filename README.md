# Android Quiz App 🎯

A modern Android quiz application built with Jetpack Compose, Kotlin, and Clean Architecture principles. Test your knowledge of Android development concepts, Kotlin programming, and software design principles.

## 📱 Features

- **Interactive Quiz Interface**: Clean, modern UI built with Jetpack Compose
- **Comprehensive Question Bank**: 28 carefully crafted questions covering:
  - Android fundamentals (Activities, Services, Fragments, etc.)
  - Kotlin language features (`val` vs `var`, coroutines, `lateinit` vs `lazy`, etc.)
  - Software engineering principles (SOLID principles)
  - Android Architecture Components
  - Modern Android development practices

- **Smart Navigation**: 
  - Progress through questions with Previous/Next buttons
  - Visual progress indicator
  - Quiz completion screen with restart option

- **Randomized Questions**: Questions are shuffled for each quiz session
- **Text-to-Speech Integration**: Audio playback of questions and answers (if implemented)
- **Clean Architecture**: Repository pattern with dependency injection
- **Modern Android Stack**: Built with the latest Android development best practices

## 🏗️ Architecture

This project follows Clean Architecture principles and modern Android development patterns:

```
app/
├── data/                   # Data layer
│   ├── QuizData.kt        # Data models
│   ├── QuizDataSource.kt  # Data source interface
│   └── QuizLocalDataSource.kt # Local data implementation
├── di/                     # Dependency Injection
│   └── RepositoryModule.kt
├── repository/             # Repository layer
│   ├── QuizRepository.kt   # Repository interface
│   └── QuizRepositoryImpl.kt # Repository implementation
├── ui/                     # Presentation layer
│   ├── screens/           # Screen composables
│   ├── components/        # Reusable UI components
│   └── theme/             # App theming
├── viewmodel/             # ViewModels
└── QuizApplication.kt     # Application class
```

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM + Clean Architecture
- **Dependency Injection**: Dagger Hilt
- **Asynchronous Programming**: Kotlin Coroutines & Flow
- **State Management**: StateFlow
- **Build System**: Gradle with Kotlin DSL

## 📋 Requirements

- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 36
- **Compile SDK**: API 36
- **Kotlin Version**: Compatible with latest stable
- **Java Version**: 11

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or newer
- JDK 11 or higher
- Android SDK with API level 36

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/smithjustinn84-netizen/AndroidQuiz.git
   cd AndroidQuiz
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory and select it

3. **Build the project**
   ```bash
   ./gradlew build
   ```

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button in Android Studio or use:
   ```bash
   ./gradlew installDebug
   ```

## 🎮 How to Use

1. **Start Quiz**: Launch the app to begin the quiz automatically
2. **Navigate Questions**: Use "Previous" and "Next" buttons to move through questions
3. **View Progress**: Monitor your progress with the progress indicator at the top
4. **Read Answers**: Tap "Show Answer" to reveal detailed explanations
5. **Complete Quiz**: Finish all questions to see the completion screen
6. **Restart**: Use the restart button to take the quiz again with reshuffled questions

## 📚 Sample Questions

The app includes questions covering various topics:

- **Android Basics**: Activities, Services, BroadcastReceivers, ContentProviders
- **Android Architecture**: ViewModel, LiveData, Repository Pattern
- **Kotlin Features**: Data classes, coroutines, null safety, delegation
- **Modern Android**: Jetpack Compose, Architecture Components
- **Design Principles**: SOLID principles, Clean Architecture concepts

## 🔧 Key Components

### QuizViewModel
- Manages quiz state and business logic
- Handles question navigation and progress tracking
- Implements reactive programming with StateFlow

### Repository Pattern
- `QuizRepository`: Abstraction for data access
- `QuizLocalDataSource`: Local data implementation
- Supports future extensibility (network data sources, etc.)

### Dependency Injection
- Dagger Hilt for dependency management
- Modular architecture supporting testability
- Clean separation of concerns

## 🎨 UI/UX Features

- **Material Design 3**: Modern, accessible design language
- **Responsive Layout**: Optimized for various screen sizes
- **Edge-to-Edge Display**: Modern Android visual standards
- **Smooth Animations**: Polished user interactions
- **Progress Tracking**: Visual feedback on quiz completion

## 🧪 Testing

The project includes test infrastructure:

```bash
# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest
```

## 📁 Project Structure

```
AndroidQuiz/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/androidquiz/
│   │   │   │   ├── data/           # Data models and sources
│   │   │   │   ├── di/             # Dependency injection
│   │   │   │   ├── repository/     # Data repository layer
│   │   │   │   ├── ui/             # Compose UI components
│   │   │   │   ├── viewmodel/      # ViewModels
│   │   │   │   ├── MainActivity.kt
│   │   │   │   └── QuizApplication.kt
│   │   │   └── res/                # Resources
│   │   ├── androidTest/            # Instrumented tests
│   │   └── test/                   # Unit tests
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🔮 Future Enhancements

- [ ] **Score Tracking**: Implement scoring system with analytics
- [ ] **Categories**: Organize questions by topic/difficulty
- [ ] **Timer Mode**: Add timed quiz challenges
- [ ] **Offline Support**: Enhanced offline capabilities
- [ ] **Question Editor**: Allow custom question creation
- [ ] **Social Features**: Share scores and compete with friends
- [ ] **Adaptive Learning**: Personalized question recommendations
- [ ] **Multiple Languages**: Internationalization support

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Android development community for best practices and patterns
- Jetpack Compose team for the modern UI toolkit
- Contributors to open-source Android libraries

## 📞 Contact

**Developer**: Justin Smith  
**GitHub**: [@smithjustinn84-netizen](https://github.com/smithjustinn84-netizen)  
**Project Link**: [https://github.com/smithjustinn84-netizen/AndroidQuiz](https://github.com/smithjustinn84-netizen/AndroidQuiz)

---

*Built with ❤️ using Kotlin and Jetpack Compose*