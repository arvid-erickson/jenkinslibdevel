def call()
{
  env.workspace = ''
  /*
  if (currentBuild.rawBuild.getCauses().contains("UserId") || (currentBuild.rawBuild.getCauses().contains("RestoreFromCheckpointCause")){
  
    node('cdPipelineLINUX') {
      if (env.workspace == '' ){
        env.workspace = pwd()
      } */
      println "calue of workspace is ${env.workspace}"
   /* 
      if ("RELEASE".equals(env.JOB_TYPE)){
        println(""
        sh ""
      } else if ("DELIVERY".equals(env.JOB_TYPE)){
        println(""
        sh ""
      }
    }
     
  }
                */
}
