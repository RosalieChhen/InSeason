# InSeason

## Testing locally

### Prerequisites
- docker-compose

### Steps
1. Clone project
2. Open terminal on the root project and start Docker deamon
3. Run `docker-compose -f docker-compose.yml up`. It will start a *db* container with postgreSQL and a *backend* container running the Sprign boot api.

## Development

### Prerequisites
- docker-compose
- Intellij

### Steps
1. Clone project
2. Open terminal on the root project and start Docker deamon
3. Run `docker-compose -f docker-compose.dev.yml up`. It will start a *db* container with postgreSQL. Run the project with th IDE.
