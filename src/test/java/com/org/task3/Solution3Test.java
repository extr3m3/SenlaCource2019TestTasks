package com.org.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {
    private final static String S1 = "Для участия в отборе, необходимо выполнить все 6 заданий и вкоммитать их в git репозиторий ОДНИМ проектом";
    private final static String S2 = "Ссылка на репозиторий должна быть прикреплена к форме регистрации, в необходимом поле";
    private final static String S3 = "Приветствуется соответствие принципам ООП и сильного сцепления";

    @Test
    public void testGetWordCount() {
        assertEquals ( 17, Solution3.getWordCount(S1));
        assertEquals ( 12, Solution3.getWordCount(S2));
        assertEquals ( 7, Solution3.getWordCount(S3));
    }
    @Test
    public void testSortString() {
        assertEquals ( "6 Git В В Вкоммитать Все Выполнить Для Заданий И Их Необходимо ОДНИМ Отборе, Проектом Репозиторий Участия", Solution3.sortString(S1));
        assertEquals ( "Быть В Должна К На Необходимом Поле Прикреплена Регистрации, Репозиторий Ссылка Форме", Solution3.sortString(S2));
        assertEquals ( "И ООП Приветствуется Принципам Сильного Соответствие Сцепления", Solution3.sortString(S3));
    }
    @Test
    public void testFormatOutput() {
        assertEquals ( "6 Git В В Вкоммитать Все Выполнить Для Заданий И Их Необходимо ОДНИМ Отборе, Проектом Репозиторий Участия (количество слов в предложении: 17)", Solution3.formatOutput(S1));
        assertEquals ( "Быть В Должна К На Необходимом Поле Прикреплена Регистрации, Репозиторий Ссылка Форме (количество слов в предложении: 12)", Solution3.formatOutput(S2));
        assertEquals ( "И ООП Приветствуется Принципам Сильного Соответствие Сцепления (количество слов в предложении: 7)", Solution3.formatOutput(S3));
    }
}

