package Sequencetable;

import java.util.Arrays;

public class homeworkcode {
    public static void main(String[] args) {
        Integer src[] = {1,2};
        SqListClass<Integer> sq = new SqListClass<Integer>();
        sq.CreateList(src);
        sq.Add(5);
        System.out.println(Arrays.toString(src));
        sq.toString();
        System.out.println(sq.toString());

    }
    public static class SqListClass <E> {
        final int initcapacity = 10;
        public E[] data;
        public int size;
        private int capacity;

        public SqListClass() {
            data = (E[]) new Object[initcapacity];
            capacity = initcapacity;
            size = 0;
        }

        private void updatecapacity(int newcapacity) {
            E[] newdata = (E[]) new Object[newcapacity];
            for (int i = 0; i < size; i++) {
                newdata[i] = data[i];
                capacity = newcapacity;
                data = newdata;

            }
        }

        public void CreateList(E[] a) {
            size = 0;
            for (int i = 0; i < a.length; i++) {
                if (size == capacity) {
                    updatecapacity(2 * size);
                }
                data[size] = a[i];
                size++;
            }
        }

        public void Add(E e) {
            if (size == capacity) {
                updatecapacity(2 * size);
            }
            data[size] = e;
            size++;
        }

        public int size() {
            return size;
        }

        public void Setsize(int nlen) throws IllegalAccessException {
            if (nlen < 0 || nlen > size) {
                throw new IllegalAccessException("设置长度：n不在有效范围内");
            }
            size = nlen;
        }

        public E GetElem(int i) throws IllegalAccessException {
            if (i < 0 || i > size - 1) {
                throw new IllegalAccessException("查找：位置i不在有效范围内");
            }
            return (E) data[i];
        }

        public void SetElem(int i, E e) throws IllegalAccessException {
            if (i < 0 || i > size - 1) {
                throw new IllegalAccessException("查找：位置i不在有效范围内");
            }
            data[i] = e;
        }

        public int GetNo(E e) {
            int i = 0;
            while (i < size && !data[i].equals(e)) {
                i++;
            }
            if (i >= size) {
                return -1;
            } else {
                return i;
            }
        }

        public void swap(int i, int j) {
            E tmp = data[i];
            data[i] = data[i];
            data[j] = tmp;
        }

        public void Insert(int i, E e) {
            if (size == capacity) {
                updatecapacity(2 * size);
            }
            for (int j = size; j < i; j--) {
                data[j] = data[j - 1];
            }
            data[i] = e;
            size++;
        }

        public void Delete(int i)throws IllegalAccessException{
            if (i<0||i>size-1) {
                throw new IllegalAccessException("删除：位置i不在有效范围内");
            }
            for (int j = 0; j < size-1; j++) {
                data[j] = data[j+1];
            }
            size--;
            if (capacity>initcapacity&&size==capacity/4) {
                updatecapacity(capacity/2);
            }
        }

        public String toString(){
            String ans = "";
            for (int i = 0; i < size; i++) {
                ans+=data[i].toString()+"   ";

            }
            return ans;
        }



    }
}
