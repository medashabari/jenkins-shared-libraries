def call(String credentialsID, String imageName, String tag){
  withCredentials([usernamePassword(
            credentialsId: credentialsID, 
            passwordVariable: 'dockerHubPass', 
            usernameVariable: 'dockerHubUser')]) {
    
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker push ${env.dockerHubUser}/${imageName}:${tag}"
    }
}
