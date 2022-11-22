#!/bin/sh

mode=$1
target=$2

if [ "$mode" = "start" ]; then
  docker-compose start "$target"
elif [ "$mode" = "stop" ]; then
  docker-compose stop "$target"
elif [ "$mode" = "ps" ]; then
  docker-compose ps
else
  echo "syntax is below"
  echo "-------------------------------------------------------------------"
  echo "sh ./container_operation.sh mode target"
  echo "mode: start/stop/ps"
  echo "target: container name when ps, it isn't needed."
  echo "if you don't know container name, you should execute the mode 'ps' "
  echo "-------------------------------------------------------------------"
fi