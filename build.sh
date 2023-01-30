#!/usr/bin/env bash

TAG=${1:-1}

export TAG=$TAG
docker-compose build
