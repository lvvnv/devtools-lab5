# Плагин для IntelliJ Platform
Автор: Лев Войнов М33021
### Функциональность
Поиск выделенного текста по хоткеям:
- в Yandex ```Alt+Shift+Y```
- в Google ```Alt+Shift+L```
- в DuckDuckGo ```Alt+Shift+D```
- на StackOverflow ```Alt+Shift+O```
- на Quora ```Alt+Shift+Q```

Перевод выделенного текста в Google Translate: ```Alt+Shift+R```

Вывод справки по хоткеям: ```Alt+Shift+H```

### Архитектура плагина
Action-классы, наследуемые от AnAction, представляют собой действия в IDE

В классах поиска используется обработка выделенного текста с помощью Editor

В классе HelpAction используется вывод сообщения с помощью класса Message