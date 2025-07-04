🧠 Running a Local AI Model with Ollama
- Download Ollama
Visit https://ollama.com/download and install Ollama for your operating system (Mac, Linux, or Windows).

Start Ollama in the terminal
Open your terminal and run:

ollama


- Choose and run a model

Go to https://ollama.com/library, find a model (e.g. Mistral or LLaMA 3), and copy the command to run it.
Example:

ollama run mistral


This will download and start the model locally.


- Configure Spring Boot
In your application.properties file, set the model name as follows:

Example:
spring.ai.ollama.chat.options.model=mistral
