FROM tomcat

RUN ["rm", "-fr", "/usr/local/tomcat/webapps/ROOT"]

COPY ./tomcat-app.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]

# docker run -p {out-port}:{inner-port} {iamge-name}	= 	run the container with the exposed out-port
# docker ps -a										=	list all container
# docker kill {docker-id}								= 	kill container
# docker rm {docker-id}								=  	remove container
# 
# docker images										= 	list all images
# docker rmi {image-id}								=	remove image
# 
# docker build -t {tag-name} .						=	build image from the Dockerfile 
# 
# docker exec -i {docker-id} sh -c 'cat > {dest-file}' < ./{source-file} = copy file from host to conatiner
# 
# docker exec -i -t {docker-id} /bin/bash				=	shows up the container terminal

# docker tag tomcat-app mataprasad045/tomcat-app
# docker push mataprasad045/tomcat-app
# docker login