.DEFAULT_GOAL: := build-run

build-run: build run

build:
    ./mvnw clean package

test:
    ./mvnv test

update:
    ./mvnv versions:update-properties versions:display-plugin-updates