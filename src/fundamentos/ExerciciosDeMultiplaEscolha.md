Perguntas de Múltipla Escolha (10)**

**Responda e justifique cada uma!**

1. **Para que serve a pasta `src` em um projeto Java no IntelliJ?**

    - a) Guardar arquivos temporários

    - b) Guardar os códigos-fonte `.java`

    - c) Guardar arquivos compilados `.class`

    - d) Armazenar configurações do projeto

Resposta: A alternativa correta é a letra B. A pasta src (source) contém o código-fonte do projeto. O IntelliJ a identifica como "Source Root", indicando que os arquivos .java dentro dela devem ser compilados para gerar o código executável (que são os arquivos .class, normalmente salvos na pasta out).

2. **O que é a pasta `out`?**

    - a) Onde ficam os arquivos `.java`

    - b) Onde ficam arquivos baixados da internet

    - c) Onde ficam os arquivos `.class` gerados após compilação

    - d) Onde ficam as configurações de interface

Resposta: A alternativa correta é a C. A pasta out é o diretório de saída (output) padrão do IntelliJ. Quando o projeto é compilado (seja manualmente ou antes de executar), o compilador Java (javac) transforma os arquivos de código-fonte (.java da pasta src) em bytecode, que são os arquivos .class. Esses arquivos .class são salvos na pasta out, mantendo a mesma estrutura de pacotes da pasta src.

3. **O que acontece se você deletar a pasta `out` e rodar o projeto novamente?**

    - a) O projeto não funciona nunca mais

    - b) O IntelliJ cria a pasta novamente ao rodar

    - c) Perde todos os arquivos `.java`

    - d) O projeto some do computador

Resposta: A alternativa correta é a letra B. Se apagarmos a pasta out,, quando executarmos projeto ela será criada novam,ente. 

4. **Para que serve a configuração de "Sources Root" em um projeto Java?**

    - a) Indica onde estão as bibliotecas externas

    - b) Indica onde estão os arquivos de configuração

    - c) Indica a pasta principal dos códigos-fonte

    - d) Define a cor do tema do IntelliJ
Resposta: A alternativa correta é a letra C. A configuração de sources root indica onde estão os cpoódigo fonte do projeto.

5. **Se você criar um arquivo Java fora do package e tentar rodar, o que pode acontecer?**

    - a) Erro “Could not find or load main class”

    - b) O código roda normalmente

    - c) O computador reinicia

    - d) O código vira Python

6. **O que faz o comando `git pull origin main --allow-unrelated-histories`?**

    - a) Puxa alterações e força a união de históricos diferentes

    - b) Deleta o histórico do repositório

    - c) Faz backup do projeto

    - d) Atualiza apenas bibliotecas externas

7. **Como sair do editor Vim após um merge do Git?**

    - a) Digitar `exit`

    - b) Apertar Ctrl+C

    - c) Digitar `:wq` e Enter

    - d) Fechar o terminal

8. **Qual a função do arquivo `.gitignore`?**

    - a) Ignorar pastas e arquivos que não devem ser versionados

    - b) Armazenar bibliotecas

    - c) Apagar arquivos temporários

    - d) Proteger arquivos com senha

9. **O que deve sempre ser feito antes de dar um `git push`, se outras pessoas (ou você mesma em outro PC) mexeram no repositório remoto?**

    - a) Deletar o projeto local

    - b) Dar `git pull` para baixar as mudanças

    - c) Mudar de branch

    - d) Nada, pode dar push direto

10. **O que representa a pasta `.idea` em projetos IntelliJ?**

    - a) Configurações do projeto (atalhos, temas, estrutura)

    - b) Arquivos de código

    - c) Pastas de exercícios

    - d) Documentação do projeto