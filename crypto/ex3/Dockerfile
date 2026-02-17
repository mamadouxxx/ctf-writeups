FROM ubuntu:24.04

RUN apt-get update && apt-get install -y xxd socat build-essential openssl libcjson-dev libssl-dev

# Set working directory
WORKDIR /app

# Copy server script
COPY src/ .
COPY build.sh .
COPY flag3 .
COPY flag4 .

RUN ./build.sh

# build the challenge
RUN make

# Run the challenge with socat
CMD ["socat", "TCP-LISTEN:1337,reuseaddr,fork", "EXEC:./server"]