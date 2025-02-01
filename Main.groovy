pipeline {
    agent { label 'WIN10' }

    stages {
        stage('Hello') {
            steps {
                script {
                    // 使用 bat 步骤执行 Windows 命令
                    def result = bat(script: 'dir', returnStdout: true).trim()
                    echo "Command output: ${result}"         
                }
            }
        }
    }
}