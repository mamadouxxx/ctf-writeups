# Base image
FROM python:3.10-slim

# Set the working directory inside the container
WORKDIR /app

# Copy requirements first for better caching
COPY app/requirements.txt /app/requirements.txt
RUN pip install -r requirements.txt

# Copy the rest of the application
COPY app /app/

# Expose the application port
EXPOSE 5000

# Run the application
CMD ["flask", "run", "--host=0.0.0.0", "--port=5000"]
