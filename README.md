# Spring AI Project

The **sping-ai** project is a Spring Boot-based application that integrates artificial intelligence services, specifically leveraging the OpenAI API. Its main purpose is to provide an interactive experience powered by advanced AI models for custom tasks.

## Features

- Built with Spring Boot.
- Integrates the OpenAI language model.
- Simple configuration to add your API key and customize the model in use.
- Flexible and extensible for a variety of AI-focused applications.

## Prerequisites

Before running the application, make sure you have the following:

1. **Java:** Version 21 or higher.
2. **OpenAI Account:** You'll need an API key to use their services.

## Initial Configuration

The `application.properties` file contains the basic configuration parameters. Before running the application, be sure to update this file to suit your needs:

```properties
spring.application.name=sping-ai
spring.ai.openai.api-key=-put here your api key-
spring.ai.openai.chat.options.model=gpt-4.1-nano
```

### Key Parameters

- **`spring.application.name`**: Defines the application name.
- **`spring.ai.openai.api-key`**: Replace `-put here your api key-` with your personal OpenAI API key.
- **`spring.ai.openai.chat.options.model`**: Specifies the OpenAI API model you want to use, such as `gpt-4.1-nano`. You can modify this value to use another model supported by OpenAI.

## How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone <REPOSITORY_URL>
   cd sping-ai
   ```

2. Ensure the `application.properties` file is correctly configured.

3. Build and run the application using Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. The application will be available at `http://localhost:8080` (default port).

## Usage

### Endpoints

Document all available endpoints here (if already defined). For example:

- `GET /ai-chat`: Starts a conversation with the AI.
- `POST /ai-prompt`: Submits a new prompt for customization.

Make sure to describe each route for proper usage.

## Customization

To modify the AI model being used or change other configuration parameters, edit the `application.properties` file. Refer to the official **OpenAI** and **Spring Boot** documentation for advanced options.

## Resources

- **Spring Boot**: [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
- **OpenAI API**: [https://platform.openai.com/docs/](https://platform.openai.com/docs/)

## Contribution

If you'd like to contribute to this project:

1. Fork this repository.
2. Create a new branch for your feature/fix: `git checkout -b feature/new-feature`.
3. Make your changes and commit them: `git commit -m 'Add new feature'`.
4. Push your changes: `git push origin feature/new-feature`.
5. Open a pull request.

## License
---
