# SpringAI-PG-Vector-Store

This project demonstrates a Spring Boot application integrating **vector search** with **PostgreSQL pgvector** and AI chat models.  
It supports two AI backends:  
- **OpenAI** (cloud-based)  
- **Ollama** (local AI model)

---

## Features

- Store and search vector embeddings in PostgreSQL using pgvector  
- Chat and recommendation API powered by AI models  
- Switch easily between OpenAI and Ollama models  
- Initialize vector data from text files  

---

## Project Structure

- **AppConfig**: Configures the pgvector-based VectorStore with embedding dimensions and settings.  
- **DataInitializer**: Loads and splits text data into documents, then adds them to the vector store on startup.  
- **OpenAIController**: Provides REST endpoints for chat, embedding, similarity, and vector search using OpenAI API.  
- **OllamaController** (commented out by default): Alternative REST controller to use a local Ollama AI model.

---

## Setup

### PostgreSQL pgvector

Ensure you have a PostgreSQL database with the pgvector extension installed and configured.

### Dependencies

The project uses these Spring AI starters:

- `spring-ai-starter-vector-store-pgvector`  
- `spring-ai-starter-model-openai` (for OpenAI)  
- `spring-ai-starter-model-ollama` (for Ollama) — keep commented if not used  

---

## Running with OpenAI

1. Configure your OpenAI API key in `application.properties`.  
2. Ensure `OpenAIController` is enabled and `OllamaController` is commented out.  
3. Start the app and use the `/api/*` endpoints for chat and vector operations.

---

## Running with Ollama (Local AI Model)

1. Download and install Ollama: https://ollama.com/download  
2. Start Ollama in your terminal by running `ollama`  
3. Run a model locally, e.g.:  
   ```bash
   ollama run mistral
