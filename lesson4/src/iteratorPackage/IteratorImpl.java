package iteratorPackage;

public class IteratorImpl implements Iterator {
    private Unit linkСurrent;
    private Unit linkPrev;
    private ListUnit list;

    IteratorImpl (ListUnit list) {
        this.list = list;
        this.reset();
    }

    @Override
    //перемещение в начало списка
    public void reset() {
        this.linkСurrent = list.getFirst();
        this.linkPrev = null;
    }

    @Override
    //перемещение к следующиму итератору
    public void nextLink() {
        if (this.linkСurrent.getNext() != null) {
            this.linkPrev = this.linkСurrent;
            this.linkСurrent = this.linkСurrent.getNext();
        }
    }

    @Override
    //перемещение к предыдущему итератору
    public void prevLink() {
        if (this.linkСurrent.getPrev() != null) {
            this.linkСurrent = this.linkPrev;
            this.linkPrev = this.linkPrev.getPrev();
        }
    }

    @Override
    //получение элемента, на который указывает итератор
    public Unit getCurrent() {
        return this.linkСurrent;
    }

    @Override
    //true, если итератор в конце списка
    public boolean atEnd() {
        return this.linkСurrent.getNext() == null;
    }

    @Override
    // вставка после итератора
    public void insertAfter(String name, String surname) {
            Unit newUnit = new Unit(name, surname, null, null);
            if (this.list.isEmpty()) {
                this.list.setFirst(newUnit);
                this.linkСurrent = newUnit;
            } else {
                newUnit.setLink(this.linkСurrent.getNext(), this.linkСurrent);
                this.linkСurrent.setLink(newUnit,this.linkСurrent.getPrev());
                this.nextLink();
            }
    }

    @Override
    //вставка до итератора
    public void insertBefore(String name, String surname) {
        Unit newUnit = new Unit(name, surname, null, null);
        if (this.list.isEmpty()) {
            this.list.setFirst(newUnit);
            this.linkСurrent = newUnit;
        } else {
            if (this.linkPrev == null) {
                newUnit.setLink(this.list.getFirst(), null);
                this.list.setFirst(newUnit);
                this.reset();
            } else {
                newUnit.setLink(this.linkPrev.getNext(), this.linkPrev);
                this.linkPrev.setLink(newUnit, this.linkPrev.getPrev());
                this.linkСurrent.setLink(this.linkСurrent.getNext(),newUnit);
                this.linkСurrent = newUnit;
            }
        }
    }

    @Override
    //удаление текущего элемента
    public String deleteCurrent() {
        String strUnit = this.linkСurrent.toString();
        if (this.linkPrev == null) {
            this.list.setFirst(this.linkСurrent.getNext());
            this.reset();
        }else {
            this.linkPrev.setLink(this.linkСurrent.getNext(), null);
            if (this.atEnd()){
                this.reset();
            }else {
                this.linkСurrent = this.linkСurrent.getNext();
            }
        }
        return strUnit;
    }
}
