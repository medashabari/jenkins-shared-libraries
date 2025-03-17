def call(String dockerUserName, String imageName, String tag){
  sh "docker build -t ${dockerUserName}/${imageName}:${tag} ."  
}
