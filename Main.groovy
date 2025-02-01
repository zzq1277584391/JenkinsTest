pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                    def command = 'cmd /c dir' // 通过 cmd 执行 dir 命令
                    def process = command.execute() // 执行命令
                    def output = process.text.trim() // 获取输出
                    echo "Command output: ${output}"           
                }
            }
        }
    }
}