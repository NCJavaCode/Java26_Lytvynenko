package ua.edu.op.nkpk.java.model;

/**
 * Клас Hall імітує сутність "Кінозал" у кінотеатрі.
 * Містить інформацію про назву та місткість залу.
 *
 * @author Yelyzaveta Lytvynenko
 * @version 1.0
 */
public class Hall {
    private String name;
    private int capacity;

    /**
     * Конструктор за замовчуванням.
     */
    public Hall() {
    }

    /**
     * Конструктор з параметрами для ініціалізації залу.
     *
     * @param name назва залу
     * @param capacity місткість залу
     */
    public Hall(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Повертає назву залу.
     *
     * @return назва залу
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює назву залу.
     *
     * @param name нова назва залу
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Повертає місткість залу.
     *
     * @return місткість залу
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Встановлює місткість залу.
     *
     * @param capacity нова місткість залу
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}