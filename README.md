# Droid Derby Server Boot

Minimal Spring Boot service with a `game` resource.

## Requirements

- Java 21
- Gradle Wrapper (`./gradlew`)

## Run

```bash
./gradlew bootRun
```

By default, the server runs on `http://localhost:8080`.

## API

### `GET /game`

Returns status `200 OK` with body:

```text
OK
```

Example:

```bash
curl -i http://localhost:8080/game
```

### `POST /game`

Accepted route but not implemented. Returns status `501 Not Implemented`.

Example:

```bash
curl -i -X POST http://localhost:8080/game
```

## Build and Test

```bash
./gradlew clean build
```
