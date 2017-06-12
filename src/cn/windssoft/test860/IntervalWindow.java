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

    String getLength() {
        return _subject.getLength();
    }

    void setLength(String arg) {
        _subject.setLength(arg);
    }

    String getEnd() {
        return _subject.getEnd();
    }

    void setEnd(String arg) {
        _subject.setEnd(arg);
    }

    String getStart() {
        return _subject.getStart();
    }

    void setStart(String arg) {
        _subject.setStart(arg);
    }

    @Override
    public void update(Observable o, Object arg) {
        _endField.setText(_subject.getEnd());
        _startField.setText(_subject.getStart());
        _lengthField.setText(_subject.getLength());
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
            if (_subject.isNotInteger(getStart()))
                setStart("0");
            _subject.calculateLength();
        }

        void EndField_FocusLost(java.awt.event.FocusEvent event) {
            setEnd(_endField.getText());
            if (_subject.isNotInteger(getEnd()))
                setEnd("0");
            _subject.calculateLength();
        }

        void LengthField_FocusLost(java.awt.event.FocusEvent event) {
            if (_subject.isNotInteger(getLength()))
                setLength("0");
            _subject.calculateEnd();
        }

    }
}
