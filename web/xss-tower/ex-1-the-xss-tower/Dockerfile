FROM python:3.12-bookworm
WORKDIR /app
RUN apt-get update && apt-get install -y wkhtmltopdf
COPY app/requirements.txt /tmp/requirements.txt
RUN pip install -r /tmp/requirements.txt