up:
	docker-compose up -d
build:
	docker-compose build --no-cache --force-rm
init:
	@make build
	@make up
rebuild:
	@make destroy
	@make init
stop:
	docker-compose stop
down:
	docker-compose down --remove-orphans
restart:
	@make down
	@make up
destroy:
	docker-compose down --rmi all --volumes --remove-orphans
destroy-volumes:
	docker-compose down --volumes --remove-orphans
ps:
	docker-compose ps
logs:
	docker-compose logs
logs-watch:
	docker-compose logs --follow
log-java:
	docker-compose logs java
log-java-watch:
	docker-compose logs --follow java
java:
	docker-compose exec java bash
cpp:
	docker-compose exec cpp bash
