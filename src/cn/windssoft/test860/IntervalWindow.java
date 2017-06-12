package cn.windssoft.test860;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by BostonHsu on 2017/6/13.
 */
public class IntervalWindow extends Frame implements Observer{
    java.awt.TextField _startField;
    java.awt.TextField _endField;
    java.awt.TextField _lengthField;
    private Interval _subject;

    public IntervalWindow() {
        _subject = new Interval();
        _subject.addObserver(this);
        update(_subject, null);
    }

    String getEnd() {
        return _subject.getEnd();
    }

    void setEnd(String arg) {
        _subject.setEnd(arg);
    }


    @Override
    public void update(Observable o, Object arg) {
        _endField.setText(_subject.getEnd());
    }

    class SymFocus extends java.awt.event.FocusAdapter {
        public void focusLost(java.awt.event.FocusEvent event) {
            Object object = event.getSource();
            if (object == _startField)
                StartField_FocusLost(event);
            else if (object == _endField)
                EndField_FocusLost(event);
            else if (object == _lengthField)
                LengthField_FocusLost(event);
        }

        void StartField_FocusLost(java.awt.event.FocusEvent event) {
            if (isNotInteger(_startField.getText()))
                _startField.setText("0");
            calculateLength();
        }

        void EndField_FocusLost(java.awt.event.FocusEvent event) {
            setEnd(_endField.getText());
            if (isNotInteger(getEnd()))
                setEnd("0");
            calculateLength();
        }

        void LengthField_FocusLost(java.awt.event.FocusEvent event) {
            if (isNotInteger(_lengthField.getText()))
                _lengthField.setText("0");
            calculateEnd();
        }

        void calculateLength() {
            try {
                int start = Integer.parseInt(_startField.getText());
                int end = Integer.parseInt(getEnd());
                int length = end - start;
                _lengthField.setText(String.valueOf(length));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        void calculateEnd() {
            try {
                int start = Integer.parseInt(_startField.getText());
                int length = Integer.parseInt(_lengthField.getText());
                int end = start + length;
                setEnd(String.valueOf(end));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        boolean isNotInteger(String arg) {
            return true;
        }
    }
}
