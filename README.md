SpringAI-PG-Vector-Store
This project demonstrates a Spring Boot application integrating vector search with PostgreSQL pgvector and AI chat models.
It supports two AI backends:

OpenAI (cloud-based)

Ollama (local AI model)

Features
Store and search vector embeddings in PostgreSQL using pgvector

Chat and recommendation API powered by AI models

Switch easily between OpenAI and Ollama models

Initialize vector data from text files

Project Structure
AppConfig: Configures the pgvector-based VectorStore with embedding dimensions and settings.

DataInitializer: Loads and splits text data into documents, then adds them to the vector store on startup.

OpenAIController: Provides REST endpoints for chat, embedding, similarity, and vector search using OpenAI API.

OllamaController (commented out by default): Alternative REST controller to use a local Ollama AI model.

Setup
PostgreSQL pgvector
Ensure you have a PostgreSQL database with the pgvector extension installed and configured.

Dependencies
The project uses these Spring AI starters:

spring-ai-starter-vector-store-pgvector

spring-ai-starter-model-openai (for OpenAI)

spring-ai-starter-model-ollama (for Ollama) — keep commented if not used

Running with OpenAI
Configure your OpenAI API key in application.properties.

Ensure OpenAIController is enabled and OllamaController is commented out.

Start the app and use the /api/* endpoints for chat and vector operations.

Running with Ollama (Local AI Model)
Download and install Ollama: https://ollama.com/download

Start Ollama in your terminal by running ollama

Run a model locally, e.g.:

arduino
Copier
Modifier
ollama run mistral
In application.properties, set:

ini
Copier
Modifier
spring.ai.ollama.chat.options.model=mistral
Comment out OpenAIController and uncomment OllamaController.

Build and run the application. It will send chat requests to the local Ollama model.

Example Usage
Chat:
GET /api/{message} — returns AI chat response

Recommend movie:
POST /api/recommend?type=action&year=2020&lang=en

Get embeddings:
POST /api/embedding?text=your text

Search similar products:
POST /api/product?text=search query

Notes
Vector dimension is set to 3072 in AppConfig. Adjust if needed.

DataInitializer reads product_details.txt from resources, splits text, and loads it into vector store.

To switch between OpenAI and Ollama, toggle the relevant controller classes and update dependencies in pom.xml.

