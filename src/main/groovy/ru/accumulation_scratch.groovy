package ru

import ru.beans.Bean

def beans1 = Bean.beans((1..10).collect {[key: it, value: it]})
def beans2 = Bean.beans((1..5).collect {[key: it, value: it]})
def beans3 = Bean.beans((1..3).collect {[key: it, value: it]})

/*
def beanTable = new BeanTable(["key"])
beanTable.whenBeanExists { oldBean, newBean ->
    oldBean.value += newBean.value
}
beanTable.add(beans1)
beanTable.add(beans2)

beanTable.join(["value"], beans3)
beanTable.select(["value"]) { it.key < 5 }
*/

